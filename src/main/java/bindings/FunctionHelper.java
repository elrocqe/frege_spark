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
	
	public static <A, B> Function<A, B> createJavaFunction(String functionName) {

		return new Function<A, B>() {
			public B call(A x) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				
				Method addValueMethod = JavaFunctionPool.class.getMethod(functionName, Double.class);
				Double value = (Double) x;
				Double result = (Double) addValueMethod.invoke(null, value);
				return (B) result;
			}
		};
	};
	
	public static <A, B> Function<A, B> createGenericFunction() {

		return new Function<A, B>() {
			public B call(A x) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		        System.out.println("Hello World From Java");
                System.out.println("value = " + x);
                //return (B) (((Double) x) * 10.0);
                return null; // TODO create generic function
			}
		};
	};
	
	
	
	public static Function<Double, Double> createFunction() {

		return new Function<Double, Double>() {
			public Double call(Double x) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		        System.out.println("Hello World From Java");
                System.out.println("value = " + x);
                return x * 10.0;
			}
		};
	};
}
