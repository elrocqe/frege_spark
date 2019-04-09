package bindings;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.api.java.function.ReduceFunction;
import org.apache.spark.sql.Row;

import frege.runtime.Lambda;
import model.JavaDataSet;

public class Functions {
	
	public static Function<String, Boolean> createStringFilterFunction(String input){
		return new Function<String, Boolean>() {
			public Boolean call(String x) {
				return x.equals(input); // TODO
			}
		};
	};
	
	public static Function<String, String> createStringMapFunction(String input){
		return new Function<String, String>() {
			public String call(String x) {
				return input + x; // TODO
			}
		};
	};
	
	public static Function<String, String> createBasicStringMapFunction(final frege.runtime.Lambda f){
		return new Function<String, String>() {
			public String call(String x) {
				return f.apply(x).result().forced(); // TODO
			}
		};
	};
	
	
	public static <A, B> Function<A, B> createFunction(Lambda f){
		return new Function<A, B>() {
			public B call(A x) {
				return f.apply(x).result().forced(); // TODO
			}
		};
	};
	
	public static Function<String, Boolean> createTypedFunction(Lambda f ){
		return new Function<String, Boolean>() {
			public Boolean call(String x) {
				return f.apply(x).result().forced(); // TODO

			};
		};
	};
	
}