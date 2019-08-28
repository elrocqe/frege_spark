package bindings;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.script.ScriptException;

import org.apache.spark.api.java.function.Function;

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
				//System.out.println("newFunction");
				return (B) (ScriptExecutor.loadAndExecuteScriptFunction(functionScript, x));
			}
		};
	};
	
	public static Function<Double, Boolean> createFilterFunction(frege.run8.Func.U<Double,Boolean> f) {
		return new Function<Double, Boolean>() {
	        public Boolean call(Double input) {
	    		    return (Boolean)f.apply(Thunk.lazy(input)).call();
	        }
		};
	};
	
}
