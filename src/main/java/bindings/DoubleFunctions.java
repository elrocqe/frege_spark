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
import bindings.Functions.MyFU;
import frege.run8.Func;

//import frege.run8.Func.U;
import frege.run8.Lazy;
import frege.run8.Thunk;
import frege.runtime.Value;
import model.JavaDataSet;
import frege.runtime.*;
public class DoubleFunctions {
	
	public static Function<Double, Double> createDoubleMapFunction(String className, String methodName){
		
		return new Function<Double, Double>() {
			public Double call(Double input) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				    Class<?> c = Class.forName(className);
					Method method = c.getMethod(methodName, double.class);
					Object o = method.invoke(null, input);
					 return (Double) o;
			}
		};
	}
	
	public static Function2<Double, Double, Double> createDoubleReduceFunction(String className, String methodName){
		
		return new Function2<Double, Double, Double>() {
			public Double call(Double a, Double b) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				    Class<?> c = Class.forName(className);
					Method method = c.getMethod(methodName, double.class, double.class);
					Object o = method.invoke(null, a, b);
					 return (Double) o;
			}
		};
	}
	
}
