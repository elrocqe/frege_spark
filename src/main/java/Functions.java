
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
	
	public static Function<DataSet, Boolean> filterHighRainFromDataSet = new Function<DataSet, Boolean>() {
        public Boolean call(DataSet dataSet) {
        		return dataSet.rre150z0 > 5.0;
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
    public static Function<String, DataSet> parseLineToDataSet = new Function<String, DataSet>() {
        public DataSet call(String s) {
        	return new DataSet(s);
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
    
    public static Function<DataSet, Double> getTemperatureFromDataSet = new Function<DataSet, Double>() {
        public Double call(DataSet dataSet) {
        		return dataSet.tre200s0;
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
