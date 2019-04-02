package bindings;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;

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
	
	
	//
	// filters
	//

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
	
	public static Function<String, Boolean> filterFive = new Function<String, Boolean>() {
        public Boolean call(String input) {
            return input.equals("5");
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
	
	//
	// mappers
	//
	
	public static Function<String, String> appendTest = new Function<String, String>() {
		public String call(String s) {
			return s + ("Test");
		}
	};
	
    public static Function<String, String[]> parseLineToStringArray = new Function<String, String[]>() {
        public String[] call(String s) {
        	return s.split(",");
        }
    };
    public static Function<String, JavaDataSet> parseLineToDataSet = new Function<String, JavaDataSet>() {
        public JavaDataSet call(String s) {
        	return new JavaDataSet(s);
        }
    };
    
    public static Function<String, Double> getTemperatureFromString = new Function<String, Double>() {
        public Double call(String input) {
        	String[] data = input.split(",");
            return Double.parseDouble(data[10]);
        }
    };
    
    public static Function<String[], Double> getTemperatureFromStringArray = new Function<String[], Double>() {
        public Double call(String[] data) {
            return Double.parseDouble(data[10]);
        }
    };
    
    public static Function<JavaDataSet, Double> getTemperatureFromDataSet = new Function<JavaDataSet, Double>() {
        public Double call(JavaDataSet dataSet) {
        		return dataSet.getTre200s0();
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
