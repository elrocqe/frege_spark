package bindings;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;

import frege.run8.Func;
import frege.run8.Thunk;
import script.ScriptExecutor;

public class Function2Helper {
	
	public static <A, B, C> Function2<A, B, C> createInterpretedFunction(String functionName){
		return new Function2<A, B, C>() {
			@Override
			public C call(A v1, B v2) throws Exception {
				return (C) ScriptExecutor.executeFunction2(functionName, v1, v2);
			}
		};
	};
	
	public static <A, B, C> Function2<A, B, C> createFunction2(Func.B<A, B, C> f) {
		  return new Function2<A, B, C>() {
			  public C call(A x, B y) {
				  return (C) f.apply(Thunk.lazy(x), Thunk.lazy(y)).call();
			  }
		  };
	};
}
