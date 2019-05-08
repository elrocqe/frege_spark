package bindings;


import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.api.java.function.ReduceFunction;
import org.apache.spark.sql.Row;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

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
		frege.run8.Func.U<String, String> fStored = f;
		return new Function<String, String>() {
			
			public String call(String x) {
				 //String result = Thunk.lazy(x).call();
				 //Lazy<String> result1 = sf.apply(Thunk.lazy(x));
			    // String result2 = result1.call();
				 return fStored.apply(Thunk.lazy(x)).call();
				 //return computations.BasicFregeFunction.appendTest(x);// //(String)bs.call();

				//Boolean result = getResult(f, x);
				//return result.booleanValue(); // TODO
			}
		};
	};
	
	
	public static Function<String, String> createStringMapFunction(String className, String methodName){
		
		return new Function<String, String>() {
			public String call(String input) {
				 //String result = Thunk.lazy(x).call();
				 //Lazy<String> result1 = sf.apply(Thunk.lazy(x));
			    // String result2 = result1.call();

				try {
				    Class<?> c = Class.forName(className);
					Method method = c.getMethod(methodName, String.class);
					Object o = method.invoke(null, input);
					 return (String) o;// //(String)bs.call();

				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return "unsucessful";
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
	
	public static class MyU<T1, T2> implements Func.U<String, String>, Serializable {
		private static final long serialVersionUID = -3157507877317885555L;
		transient frege.run8.Func.U<String, String> function;
		public MyU(frege.run8.Func.U<String, String> f) {
			this.function = f;
			// TODO Auto-generated constructor stub
		}

		@Override
		public Lazy<String> apply(Lazy<String> a) {
			// TODO how to implement apply?
			return this.function.apply(a);
		}
	}
	
	public static Object serialize(Func.U<Double, Double> f) {
		// Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream("file.ser"); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            
            // Method for serialization of object 
            SerializableFunction sf = new SerializableFunction(f);
            out.writeObject(sf); 
              
            out.close(); 
            file.close(); 
            FileInputStream filein = new FileInputStream("file.ser"); 
            ObjectInputStream in = new ObjectInputStream(filein); 
              
            // Method for deserialization of object 
            Object object1 = in.readObject(); 
            System.out.println("Object has been serialized");
            return object1;
              
        } catch(Exception e) {
        	e.printStackTrace();
        }
        return null;
  
	}
	public static Func.U<Double, Double> deserialize() {
		// Serialization  
        try
        {    
            FileInputStream filein = new FileInputStream("file.ser"); 
            ObjectInputStream in = new ObjectInputStream(filein); 
              
            // Method for deserialization of object 
            Func.U<Double, Double> f = ((SerializableFunction) in.readObject()).getF(); 
            System.out.println("Object has been serialized");
            return f;
              
        } catch(Exception e) {
        	e.printStackTrace();
        }
        return null;
  
	}

	public static <R> Function<Double, Double> createDoubleFunction(Func.U<Double, Double> f){
		
		Object o = serialize(f);
		
		
		return new Function<Double, Double>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public Double call(Double x) {
				//System.out.println(sf.toString()); TODO any usage of f or sf in here leads to Exception in thread "main" org.apache.spark.SparkException: Task not serializable
				//Boolean result = f.apply(Thunk.lazy(x)).call();
				 return getResult(deserialize(), x); //sf.apply(Thunk.lazy(x)).call();

				//Boolean result = getResult(f, x);
				//return result.booleanValue(); // TODO
			}
		};
	};
	
	public static Double getResult(Func.U<Double, Double> f, Double x) {
		Double result = f.apply(Thunk.lazy(x)).call();
		return result;
	}
	
	
	public static class MyFU implements Serializable  {
	    static frege.run8.Func.U<String, String> function;
		public MyFU(frege.run8.Func.U<String, String> f) {
			this.function = f;
			// TODO Auto-generated constructor stub
		}
	}
	
	public static class MyEU implements Externalizable  {
		frege.run8.Func.U<String, String> function;
		Kryo kryo = new Kryo();
		public MyEU(frege.run8.Func.U<String, String> f) {
			this.function = f;
			// TODO Auto-generated constructor stub
		}
		
		public MyEU() {
			// TODO Auto-generated constructor stub
		}
		

		public frege.run8.Func.U<String, String> getFunction() {
			return function;
		}



		public void setFunction(frege.run8.Func.U<String, String> function) {
			this.function = function;
		}
		
		public Kryo getKryo() {
			return kryo;
		}

		public void setKryo(Kryo kryo) {
			this.kryo = kryo;
		}

		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
			// TODO Auto-generated method stub
		    Output output = new Output(new FileOutputStream("file.dat"));
					/*
					Method writeReplace;
					writeReplace = function.getClass().getDeclaredMethod("writeReplace");
					writeReplace.setAccessible(true);
					SerializedLambda sl = (SerializedLambda) writeReplace.invoke(function);
					out.writeObject(sl);*/
					 
					    kryo.writeClassAndObject(output, function);
					    output.close();
					 


		}



		@Override
		public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
				/*Method readResolve;
				readResolve = function.getClass().getDeclaredMethod("readResolve");
				readResolve.setAccessible(true);
				SerializedLambda sl = (SerializedLambda) in.readObject();
				function = (frege.run8.Func.U<String, String>) readResolve.invoke(sl);*/
		    Input input = new Input(new FileInputStream("file.dat"));
		    function = (frege.run8.Func.U<String, String>)kryo.readClassAndObject(input);
		    input.close();
			
			
		}
	}
	
	public static Function<String, String> createStringTypedFunction(Func.U<String, String> f){
		//final Func.U<String, String> sf =  (Func.U<String, String> & Serializable) f;
		//MyEU myEU = new MyEU(f);
		MyFU myFU = new MyFU(f);
		System.out.println("dasdsk");
		//MySerializableFuncWrapper sf = new MySerializableFuncWrapper(f);
		Function<String, String> newF = new Function<String, String>() {
			public String call(String x) {
				//System.out.println(sf.toString()); TODO any usage of f or sf in here leads to Exception in thread "main" org.apache.spark.SparkException: Task not serializable
				String result = myFU.function.apply(Thunk.lazy(x)).call();
				 //return myEU.getFunction().apply(Thunk.lazy(x)).call();

				//Boolean result = getResult(f, x);
				//return result.booleanValue(); // TODO
				return result;
			}
		};
		//Function<String, String> newSF = (Function<String, String> & Serializable) newF;
		return newF;
	};
	
	public static class MyDFU implements Serializable  {
	    static frege.run8.Func.U<Double, Boolean> function;
		public MyDFU(frege.run8.Func.U<Double, Boolean> f) {
			this.function = f;
			// TODO Auto-generated constructor stub
		}
	}
	
	public static class FuncUWrapper <A, B> implements Serializable  {
	    static frege.run8.Func.U function;
		public FuncUWrapper(frege.run8.Func.U<A, B> f) {
			function = f;
			// TODO Auto-generated constructor stub
		}
	}
	
	public static <A, B> Function<A, B> createGenericFunction(Func.U<A, B> f){
		//final Func.U<String, String> sf =  (Func.U<String, String> & Serializable) f;
		//MyEU myEU = new MyEU(f);
		FuncUWrapper funcUWrapper = new FuncUWrapper(f);
		System.out.println("createGenericFunction");
		//MySerializableFuncWrapper sf = new MySerializableFuncWrapper(f);
		Function<A, B> newF = new Function<A, B>() {
			public B call(A x) {
				//System.out.println(sf.toString()); TODO any usage of f or sf in here leads to Exception in thread "main" org.apache.spark.SparkException: Task not serializable
				return (B) funcUWrapper.function.apply(Thunk.lazy(x)).call();
				 //return myEU.getFunction().apply(Thunk.lazy(x)).call();

				//Boolean result = getResult(f, x);
				//return result.booleanValue(); // TODO
			}
		};
		//Function<String, String> newSF = (Function<String, String> & Serializable) newF;
		return newF;
	};
	
	
	public static Function<Double, Boolean> createDoubleTypedFilterFunction(Func.U<Double, Boolean> f){
		//final Func.U<String, String> sf =  (Func.U<String, String> & Serializable) f;
		//MyEU myEU = new MyEU(f);
		MyDFU myDFU = new MyDFU(f);
		System.out.println("dasdsk");
		//MySerializableFuncWrapper sf = new MySerializableFuncWrapper(f);
		Function<Double, Boolean> newF = new Function<Double, Boolean>() {
			public Boolean call(Double x) {
				//System.out.println(sf.toString()); TODO any usage of f or sf in here leads to Exception in thread "main" org.apache.spark.SparkException: Task not serializable
				Boolean result = myDFU.function.apply(Thunk.lazy(x)).call();
				 //return myEU.getFunction().apply(Thunk.lazy(x)).call();

				//Boolean result = getResult(f, x);
				//return result.booleanValue(); // TODO
				return result;
			}
		};
		//Function<String, String> newSF = (Function<String, String> & Serializable) newF;
		return newF;
	};
	
	
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
