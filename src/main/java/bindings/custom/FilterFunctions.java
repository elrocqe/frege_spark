package bindings.custom;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.Row;

public class FilterFunctions {
	
	/*
	 * filter (org.apache.spark.api.java.function.Function<A, B>)
	 */
	
	public static Function<String, Boolean> filterThreeOrFiveString = new Function<String, Boolean>() {
        public Boolean call(String input) {
            return input.equals("3") || input.equals("5");
        }
	};
	
	public static Function<Double, Boolean> filterThreeOrFiveDouble = new Function<Double, Boolean>() {
        public Boolean call(Double input) {
            return input == 3.0 || input == 5.0;
        }
	};
	
	
	/*
	 *  filter (org.apache.spark.api.java.function.FilerFunction<A>) 
	 */
	
	public static FilterFunction<String> filterFunctionThreeOrFiveString = new FilterFunction<String>() {
        public boolean call(String input) {
            return input.equals("3") || input.equals("5");
        }
	};
	
	public static FilterFunction<Double> filterFunctionThreeOrFiveDouble = new FilterFunction<Double>() {
        public boolean call(Double input) {
            return input == 3.0 || input == 5.0;
        }
	};
	
	public static FilterFunction<Row> filterFunctionThreeOrFiveRow = new FilterFunction<Row>() {
        public boolean call(Row input) {
            return input.mkString().equals("3") || input.mkString().equals("5");
        }
	};
	
}
