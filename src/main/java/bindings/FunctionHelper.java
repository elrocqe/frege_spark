package bindings;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.script.ScriptException;

import org.apache.spark.api.java.function.Function;

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
	
	public static <A, B> Function<A, B> createInterpretStringFunction(String functionScript) {
		return new Function<A, B>() {
			public B call(A x) throws IOException, ScriptException {
				//System.out.println("newFunction");
				return (B) (ScriptExecutor.loadAndExecuteScriptFunction(functionScript, x));
			}
		};
	};
	
}
