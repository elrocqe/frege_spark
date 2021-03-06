package bindings;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.script.ScriptException;

import org.apache.spark.api.java.function.Function;

import functions.JavaFunctionPool;
import script.ScriptExecutor;

public class FunctionExperimentsHelper {
	
	public static <A, B> Function<A, B> createIOFunction() {
		return new Function<A, B>() {
			public B call(A x) {
				System.out.println("This function logs to the console");
				return (B) x;
			}
		};
	};
	
	
	public static <A, B> Function<A, B> preloadAndExecuteFunction(String function) {
		try {
			ScriptExecutor.loadFunction(function);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Function<A, B>() {
			public B call(A x) throws IOException, ScriptException {
				return (B) (ScriptExecutor.executeScriptFunction(x));
			}
		};
	};
	
	
	public static <A extends Number> Function<A, A> createJavaFunction() {

		return new Function<A, A>() {
			public A call(A x) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				
				return JavaFunctionPool.timesTenGeneric(x);

			}
		};
	};
	
	public static <A, B> Function<A, B> createJavaReflectionFunction(String functionName) {

		return new Function<A, B>() {
			public B call(A x) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				
				Method addValueMethod = JavaFunctionPool.class.getMethod(functionName, Double.class);
				Double value = (Double) x;
				Double result = (Double) addValueMethod.invoke(null, value);
				return (B) result;
			}
		};
	};
	
	public static <A> Function<A, Boolean> createReflectionFilterFunction(String functionName) {

		return new Function<A, Boolean>() {
			public Boolean call(A x) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
				
				Method method = Class.forName("functions.FunctionPool").getMethod(functionName, double.class);
				Double value = (Double) x;
				Boolean result = (Boolean) method.invoke(null, value);
				return result;
			}
		};
	};
	
	
	public static <A> Function<A, Boolean> createJavaReflectionFilterFunction(String functionName) {

		return new Function<A, Boolean>() {
			public Boolean call(A x) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
				
				Method method = Class.forName("functions.JavaFunctionPool").getMethod(functionName, double.class);
				Double value = (Double) x;
				Boolean result = (Boolean) method.invoke(null, value);
				return result;
			}
		};
	};
	
	
	public static <A extends Number, B extends Number> Function<A, B> createGenericFunction() {

		return new Function<A, B>() {
			public B call(A x) {
		        System.out.println("Hello World From Java");
                System.out.println("value = " + x);
                if (x == null) {
                    return null;
                }
                if (x instanceof Double) {
                    return (B) new Double(x.doubleValue() * 10);
                } else if (x instanceof Integer) {
                    return (B) new Integer(x.intValue() * 10);
                } else {
                    throw new IllegalArgumentException("Type " + x.getClass() + " is not supported by this method");
                }
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
