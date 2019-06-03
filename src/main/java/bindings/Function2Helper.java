package bindings;

import org.apache.spark.api.java.function.Function2;

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
}
