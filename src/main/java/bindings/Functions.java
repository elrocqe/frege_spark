package bindings;


import java.io.Serializable;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.api.java.function.ReduceFunction;
import org.apache.spark.sql.Row;

import bindings.FuncI.U;
import frege.run8.Func;

//import frege.run8.Func.U;
import frege.run8.Lazy;
import frege.run8.Thunk;
import frege.runtime.Value;
import model.JavaDataSet;
import frege.runtime.*;
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
	
	public static Function<String, String> createBasicStringMapFunction(Func.U<String, String> f){
	
		MySerializableFuncWrapper sf = new MySerializableFuncWrapper(f);
		return new Function<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 2432483420800545606L;

			public String call(String x) {
				//MySerializableFuncWrapper sf1 = sf;
				//MySerializableLazyWrapper bs = new MySerializableLazyWrapper(sf.apply(Thunk.lazy(x)));
				//System.out.println(sf.toString()); TODO any usage of f or sf in here leads to Exception in thread "main" org.apache.spark.SparkException: Task not serializable
				 String result = Thunk.lazy(x).call();
				 Lazy<String> result1 = sf.apply(Thunk.lazy(x));
			    // String result2 = result1.call();
				 return x + "appended";// //(String)bs.call();

				//Boolean result = getResult(f, x);
				//return result.booleanValue(); // TODO
			}
		};
	};
	
	
	public static <A, B> Function<A, B> createFunction(Object f){
		return new Function<A, B>() {
			public B call(A x) {
				return null; // f.apply(x).result().forced(); // TODO
			}
		};
	};
	
	class myFunc<String, Boolean> implements Func.U, Serializable  {
		private static final long serialVersionUID = 1L;
		
		

		public myFunc() {
			super();
			// TODO Auto-generated constructor stub
		}



		@Override
		public Lazy apply(Lazy l) {
			// TODO Auto-generated method stub
						
			return l;
		}
		
	}
	
	public static class MyU<T1, T2> implements Func.U<String, Boolean>, Serializable {
		private static final long serialVersionUID = -3157507877317885555L;
		frege.run8.Func.U<String, Boolean> function;
		public MyU(frege.run8.Func.U<String, Boolean> f) {
			this.function = f;
			// TODO Auto-generated constructor stub
		}

		@Override
		public Lazy<Boolean> apply(Lazy<String> a) {
			// TODO how to implement apply?
			return this.function.apply(a);
		}
	}
	
	public static <R> Function<String, Boolean> createTypedFunction(Func.U<String, Boolean> f){
		//MySerializableFuncWrapper sf = new MySerializableFuncWrapper(f);
		return new Function<String, Boolean>() {
			public Boolean call(String x) {
				//System.out.println(sf.toString()); TODO any usage of f or sf in here leads to Exception in thread "main" org.apache.spark.SparkException: Task not serializable
				//Boolean result = f.apply(Thunk.lazy(x)).call();
				 return true; //sf.apply(Thunk.lazy(x)).call();

				//Boolean result = getResult(f, x);
				//return result.booleanValue(); // TODO
			}
		};
	};

	/*public static <R> Function<String, Boolean> createTypedFunction(Func.U<String, Boolean> f){
		return new Function<String, Boolean>() {
			private static final long serialVersionUID = 1L;

			public Boolean call(String x) {
				Lazy<Boolean> a = f.apply(Thunk.lazy(x));
				Boolean result = a.call();
				return result; // TODO

			};
		};
	};*/
	
	
}
