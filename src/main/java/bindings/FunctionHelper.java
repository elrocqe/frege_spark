package bindings;

import java.io.IOException;
import javax.script.ScriptException;

import org.apache.spark.api.java.function.Function;

import script.ScriptExecutor;

public class FunctionHelper {

	public static <A, B> Function<A, B> createInterpretedFunction(String functionName) {

		return new Function<A, B>() {
			public B call(A x) throws IOException, ScriptException {
				return (B) ScriptExecutor.executeFunction(functionName, x);
			}
		};
	};

}
