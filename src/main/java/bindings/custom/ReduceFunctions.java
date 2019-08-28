package bindings.custom;

import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.ReduceFunction;

public class ReduceFunctions {
	
    /*
     * reduce (org.apache.spark.api.java.function.Function2<A, B, C>)
     */
	
	public static Function2<Double, Double, Double> getSumDouble = new Function2<Double, Double, Double>() {
		 public Double call(Double a, Double b) {
	        	return a + b;
	      }
	};
    
    /*
     * reduce (org.apache.spark.api.java.function.ReduceFunction<A>)
     */
	
	public static ReduceFunction<String> getSumReduceFunctionString = new ReduceFunction<String>() {
		 public String call(String a, String b) {
	        	return Integer.toString(Integer.valueOf(a) + Integer.valueOf(b));
	      }
	};
	
	public static ReduceFunction<Double> getSumReduceFunctionDouble = new ReduceFunction<Double>() {
		 public Double call(Double a, Double b) {
	        	return a + b;
	      }
	};
}
