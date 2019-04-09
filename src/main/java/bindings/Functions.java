package bindings;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.api.java.function.ReduceFunction;
import org.apache.spark.sql.Row;

import frege.run8.Func;
import frege.run8.Func.U;
import frege.runtime.Fun1;
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
	
	public static Function<String, String> createBasicStringMapFunction(final Func.U<String, String> f){
		return new Function<String, String>() {
			public String call(String x) {
				U<String, String> a = f;
				return "mytest";//.apply(x).result().forced(); // TODO
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