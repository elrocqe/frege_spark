package main.java;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;

public class Functions {
	
	//
	// filters
	//
	
	public static Function<String, Boolean> equalsOne = new Function<String, Boolean>() {
		public Boolean call(String s) {
			return s.equals("1");
		}
	};
	
	public static Function<String[], Boolean> filterHighRain = new Function<String[], Boolean>() {
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
	
	//
	// mappers
	//
	
	public static Function<String, String> appendTest = new Function<String, String>() {
		public String call(String s) {
			return s + ("Test");
		}
	};
	
    public static Function<String, String[]> parseLine = new Function<String, String[]>() {
        public String[] call(String s) {
            return s.split(",");
        }
    };
    
    public static Function<String[], Double> getTemperature = new Function<String[], Double>() {
        public Double call(String[] data) {
            return Double.parseDouble(data[10]);
        }
    };
    
    public static Function<String, Double> getTemperatureFromString = new Function<String, Double>() {
        public Double call(String input) {
        	String[] data = input.split(",");
            return Double.parseDouble(data[10]);
        }
    };
    
    //
    // reduce
    //

	public static Function2<Double, Double, Double> getSum = new Function2<Double, Double, Double>() {
		 public Double call(Double a, Double b) {
	        	return a + b;
	      }
	};
}
