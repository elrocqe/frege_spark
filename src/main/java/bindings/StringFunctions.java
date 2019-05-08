package bindings;


import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.api.java.function.ReduceFunction;
import org.apache.spark.sql.Row;

import bindings.FuncI.U;
import frege.run8.Func;

//import frege.run8.Func.U;
import frege.run8.Lazy;
import frege.run8.Thunk;
import frege.runtime.Value;
import model.JavaDataSet;
import frege.runtime.*;
public class StringFunctions {
	
	public static Function<String, String> createStringMapFunction(String className, String methodName){
		
		return new Function<String, String>() {
			public String call(String input) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				    Class<?> c = Class.forName(className);
					Method method = c.getMethod(methodName, String.class);
					Object o = method.invoke(null, input);
					 return (String) o;
			}
		};
	}
		
	public static Function<String, Boolean> createStringFilterFunction(String className, String methodName){
		
		return new Function<String, Boolean>() {
			public Boolean call(String input) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				    Class<?> c = Class.forName(className);
					Method method = c.getMethod(methodName, String.class);
					Object o = method.invoke(null, input);
					return (Boolean) o;
			}
		};
	};
	
}
