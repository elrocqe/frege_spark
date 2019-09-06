package bindings;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.script.ScriptException;

import org.apache.spark.api.java.function.Function;

import frege.run8.Func;
import frege.run8.Thunk;
import functions.JavaFunctionPool;
import script.ScriptExecutor;

public class FunctionHelper {

	public static <A, B> Function<A, B> createInterpretedFunction(String functionName) {
		return new Function<A, B>() {
			public B call(A x) throws IOException, ScriptException {
				return (B) ScriptExecutor.executeFunction(functionName, x);
			}
		};
	};
	
	public static <A, B> Function<A, B> createInterpretScriptFunction(String functionScript) {
		return new Function<A, B>() {
			public B call(A x) throws IOException, ScriptException {
				return (B) (ScriptExecutor.loadAndExecuteScriptFunction(functionScript, x));
			}
		};
	};
	
	
	public static Function<Double, Boolean> createFilterFunctionDouble(Func.U<Double,Boolean> f) {
		return new Function<Double, Boolean>() {
	        public Boolean call(Double input) {
	    		    return (Boolean)f.apply(Thunk.lazy(input)).call();
	        }
		};
	};
	
	public static <A> Function<A, Boolean> createFilterFunction(Func.U<A,Boolean> f) {
		return new Function<A, Boolean>() {
	        public Boolean call(A input) {
	    		    return (Boolean)f.apply(Thunk.lazy(input)).call();
	        }
		};
	};
	
	public static <A, B> Function<A, B> createFunction(Func.U<A, B> f) {
			return new Function<A, B>() {
				public B call(A x) {
					return (B) f.apply(Thunk.lazy(x)).call();
				}
		  };
	};

	
}
