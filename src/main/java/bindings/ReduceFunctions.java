package bindings;

import java.math.BigInteger;

import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.ReduceFunction;

public class ReduceFunctions {
	
    
    //
    // reduce
    //

	public static Function2<Double, Double, Double> getSum = new Function2<Double, Double, Double>() {
		 public Double call(Double a, Double b) {
	        	return a + b;
	      }
	};
	
	public static Function2<BigInteger, BigInteger, BigInteger> getSumOnInteger = new Function2<BigInteger, BigInteger, BigInteger>() {
		 public BigInteger call(BigInteger a, BigInteger b) {
	        	return a.add(b);
	      }
	};
	public static ReduceFunction<BigInteger> getIntegerSum = new ReduceFunction<BigInteger>() {
		 public BigInteger call(BigInteger a, BigInteger b) {
	        	return a.add(b);
	      }
	};
	
	public static ReduceFunction<Double> getDoubleSum = new ReduceFunction<Double>() {
		 public Double call(Double a, Double b) {
	        	return a + b;
	      }
	};
	
	public static ReduceFunction<String> getStringSum = new ReduceFunction<String>() {
		 public String call(String a, String b) {
	        	return Integer.toString(Integer.valueOf(a) + Integer.valueOf(b));
	      }
	};
}
