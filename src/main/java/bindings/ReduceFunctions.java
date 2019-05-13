package bindings;

import java.math.BigInteger;
import java.util.UUID;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.ReduceFunction;

import frege.run8.Func;
import frege.run8.Thunk;

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
	
	public static <A, B, C> Function2<A, B, C> create(Func.U<A, Func.U<B, C>> f){
		UUID i = FunctionPool.add(f);
		return new Function2<A, B, C>() {
			@Override
			public C call(A v1, B v2) throws Exception {
				Func.U<A, Func.U <B, C>> f = FunctionPool.getFunction(i);
				return (C) f.apply(Thunk.lazy(v1)).call().apply(Thunk.lazy(v2)).call();
			}
		};
	};
}
