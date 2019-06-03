package experiments.props;

import java.math.BigInteger;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.api.java.function.ReduceFunction;
import org.apache.spark.sql.Row;

import experiments.model.JavaDataSet;

public class MapFunctions {
	
	
	//
	// map (org.apache.spark.api.java.function.Function<A, B>)
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
    
	public static Function<Double, Double> addOne = new Function<Double, Double>() {
		public Double call(Double s) {
			return s + 1.0;
		}
	};
	
	public static Function<BigInteger, BigInteger> addOneOnInteger = new Function<BigInteger, BigInteger>() {
		public BigInteger call(BigInteger s) {
			return s.add(new BigInteger("1"));
		}
	};
	
	public static Function<String, Double> convertToDouble = new Function<String, Double>() {
		public Double call(String s) {
			return Double.parseDouble(s);
		}
	};
	
	public static Function<String, BigInteger> convertToInteger = new Function<String, BigInteger>() {
		public BigInteger call(String s) {
			return new BigInteger(s);
		}
	};
	
	
	//
    // map (org.apache.spark.api.java.function.MapFunction<A, B>)
	//
    
	public static MapFunction<Integer,Integer> addOneMF = new MapFunction<Integer,Integer>() {
		 public Integer call(Integer a) {
	        	return a + 1;
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
    

}
