package bindings;


import java.io.Serializable;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;

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
	
	public static Function<String, String> createBasicStringMapFunction(final Object f){
		return new Function<String, String>() {
			public String call(String x) {
				return null; // f.apply(x).result().forced(); // TODO
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
		MySerializableFuncWrapper sf = new MySerializableFuncWrapper(f);
		return new Function<String, Boolean>() {
			public Boolean call(String x) {
				//System.out.println(sf.toString()); TODO any usage of f or sf in here leads to Exception in thread "main" org.apache.spark.SparkException: Task not serializable
				//Boolean result = f.apply(Thunk.lazy(x)).call();
				 return sf.apply(Thunk.lazy(x)).call();

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

	/*public static Function2<Double, Double, Double> getSum = new Function2<Double, Double, Double>() {
		 public Double apply(Double a, Double b) {
	        	return a + b;
	      }
	};*/
}
