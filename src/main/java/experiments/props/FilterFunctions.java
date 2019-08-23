package experiments.props;

import java.math.BigInteger;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.api.java.function.ReduceFunction;
import org.apache.spark.sql.Row;

import experiments.model.JavaDataSet;

import frege.run8.Func.U;
import frege.run8.Lazy;
import frege.run8.Thunk;
import java.io.Serializable;

public class FilterFunctions {
	
	
	/*
	 *  numbers 
	 */
	
	static frege.run8.Func.U<Double,Boolean> staticF = null;

	
	public static Function<String, Boolean> filterFive = new Function<String, Boolean>() {
        public Boolean call(String input) {
            return input.equals("5");
        }
	};
	
	public static Function<Double, Boolean> filterThreeOrFiveOnDouble = new Function<Double, Boolean>() {
        public Boolean call(Double input) {
            return input == 3.0 || input == 5.0;
        }
	};
	
	public static Function<Double, Boolean> filterThreeOrFiveFrege(frege.run8.Func.U<Double,Boolean> f) {
		staticF = f;
		return new Function<Double, Boolean>() {
        public Boolean call(Double input) {
    		    return (Boolean)staticF.apply(Thunk.lazy(input)).call();
        }
		};
	};
	
	/*public static Function<Double, Boolean> filterThreeOrFiveFrege(Object f) {
		System.out.println("filterThreeOrFiveFrege");
		return new Function<Double, Boolean>() {
        public Boolean call(Double input) {
    		System.out.println("filterThreeOrFiveFreg in call");
    		    return null;
        }
		};
	};*/
	
	public static Function<BigInteger, Boolean> filterThreeOrFiveOnInteger = new Function<BigInteger, Boolean>() {
        public Boolean call(BigInteger input) {
            return input.equals(new BigInteger("3")) || input.equals(new BigInteger("5"));
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
