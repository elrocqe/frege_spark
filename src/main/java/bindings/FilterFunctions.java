package bindings;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.api.java.function.ReduceFunction;
import org.apache.spark.sql.Row;

import frege.runtime.Lambda;
import model.JavaDataSet;

public class FilterFunctions {
	
	
	/*
	 *  numbers 
	 */
	
	public static Function<String, Boolean> filterFive = new Function<String, Boolean>() {
        public Boolean call(String input) {
            return input.equals("5");
        }
	};
	
	public static Function<Double, Boolean> filterThreeOrFive = new Function<Double, Boolean>() {
        public Boolean call(Double input) {
            return input == 3 || input == 5;
        }
	};
	
	public static Function<String, Boolean> filterThreeOrFiveOnString = new Function<String, Boolean>() {
        public Boolean call(String input) {
            return input.equals("3") || input.equals("5");
        }
	};
	
	public static FilterFunction<Integer> filterFunctionThreeOrFive = new FilterFunction<Integer>() {
        public boolean call(Integer input) {
            return input == 3 || input == 5;
        }
	};
	
	public static FilterFunction<String> filterFunctionThreeOrFiveString = new FilterFunction<String>() {
        public boolean call(String input) {
            return input.equals("3") || input.equals("5");
        }
	};
	
	public static FilterFunction<Row> filterFunctionThreeOrFiveRow= new FilterFunction<Row>() {
        public boolean call(Row input) {
            return input.mkString().equals("3") || input.mkString().equals("5");
        }
	};
	
	
	/*
	 *  weatherData
	 */

	public static Function<String, Boolean> filterHighRainFromString = new Function<String, Boolean>() {
        public Boolean call(String input) {
            try {
            	String[] data = input.split(",");
				String temperature = data[10];
                if (temperature.equals("")) return false;
                return Double.parseDouble(data[9]) > 5.0;
            } catch (Exception e) {
                return false;
            }
        }
	};
	

	public static Function<String[], Boolean> filterHighRainFromStringArray = new Function<String[], Boolean>() {
        public Boolean call(String[] data) {
            try {
                String temperature = data[10];
                if (temperature.equals("")) return false;
                return Double.parseDouble(data[9]) > 5.0;
            } catch (Exception e) {
                return false;
            }
        }
	};
	
	public static Function<JavaDataSet, Boolean> filterHighRainFromDataSet = new Function<JavaDataSet, Boolean>() {
        public Boolean call(JavaDataSet dataSet) {
        		return dataSet.getRre150z0() > 5.0;
        }
	};

}
