package bindings.custom;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Row;

public class MapFunctions {
	
	/*
	 * map (org.apache.spark.api.java.function.Function<A, B>)
	 */
	
	public static Function<String, Double> convertToDouble = new Function<String, Double>() {
		public Double call(String s) {
			return Double.parseDouble(s);
		}
	};
	
	public static Function<Double, Double> timesTenDouble = new Function<Double, Double>() {
		public Double call(Double s) {
			return s * 10.0;
		}
	};
	
	/*
     * map (org.apache.spark.api.java.function.MapFunction<A, B>)
	 */
	
	// addOne
	
	public static MapFunction<String,String> addOneMFString = new MapFunction<String, String>() {
		 public String call(String a) {
	        	return (Integer.toString(Integer.parseInt(a) + 1));
	      }
	};
    
	public static MapFunction<Row,String> addOneMFRow = new MapFunction<Row,String>() {
		 public String call(Row a) {
	        	return Integer.toString(Integer.parseInt(a.mkString()) + 1);
	      }
	};
	
	public static MapFunction<Double, Double> addOneMFDouble = new MapFunction<Double,Double>() {
		 public Double call(Double x) {
	        	return x + 1;
	      }
	};
	
	// timesTen
	
	public static MapFunction<Double, Double> timesTenMFString = new MapFunction<Double,Double>() {
		 public Double call(Double x) {
	        	return x * 10.0;
	      }
	};
	
	public static MapFunction<Double, Double> timesTenMFInteger = new MapFunction<Double,Double>() {
		 public Double call(Double x) {
	        	return x * 10.0;
	      }
	};
	
	public static MapFunction<Double, Double> timesTenMFDouble = new MapFunction<Double,Double>() {
		 public Double call(Double x) {
	        	return x * 10.0;
	      }
	};
}
