package bindings;

import java.io.IOException;
import java.io.Serializable;
import java.util.UUID;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.spark.api.java.function.Function;

import frege.run.Kind;
import frege.run8.Func;
import frege.run8.Lazy;
import frege.run8.Thunk;
import script.ScriptReader;
public class FunctionHelper {
	
		public static <A, B> Function<A, B> createFunction(Func.U<A, B> f){
			UUID i = FunctionPool.add(f);
			return new Function<A, B>() {
				public B call(A x) {
					Func.U f = FunctionPool.getFunction(i);
					Object o = f.apply(Thunk.lazy(x)).call();
					return (B) o;
				}
			};
		};

		
		public static <A, B> Function<A, B> createInterpretedFunction(String functionName){

			return new Function<A, B> () {
				public B call(A x) throws IOException, ScriptException {
						return (B) ScriptReader.executeFunctionFromJar(functionName, x);
				}
			};
		};
		
		public static Function<Double, Double> createInterpretedDoubleFunction(String functionName){

			return new Function<Double, Double>() {
				public Double call(Double x) {
					try {
						return (Double) ScriptReader.executeFunctionFromJar(functionName, x);
					} catch (IOException | ScriptException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return null;
				}
			};
		};
		
		
		public static Function<String, String> createInterpretedFunction2(){
			//int a = (Integer) frege.eval("1+1");
			//int b = (Integer) frege.eval("f 1");
//			System.out.println(a);
			//System.out.println(b);
	        //System.out.println("end");
			return new Function<String, String>() {
				public String call(String x) {
					try {
						final ScriptEngineManager factory = new ScriptEngineManager();
						ScriptEngine frege = factory.getEngineByName("frege");
						Object f = frege.eval("f x = x + 1");
						String c = ((Integer)frege.eval("f "+x)).toString();
						return c;

					} catch (ScriptException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//Object o = f.apply(Thunk.lazy(x)).call();
					return null;
				}
			};
		};
		
		/*
		public static Function<Double, Double> createInterpretedDoubleFunction(String script){
			//int a = (Integer) frege.eval("1+1");
			//int b = (Integer) frege.eval("f 1");
//			System.out.println(a);
			//System.out.println(b);
	        //System.out.println("end");
			return new Function<Double, Double>() {
				public Double call(Double x) {
					try {
						final ScriptEngineManager factory = new ScriptEngineManager();
						// TODO try static scriptengine
						ScriptEngine frege = factory.getEngineByName("frege");
						Object f = frege.eval(script);
						Double c = ((Double)frege.eval("f "+x.toString()));
						return c;

					} catch (ScriptException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//Object o = f.apply(Thunk.lazy(x)).call();
					return null;
				}
			};
		};
		*/
		
		
		public static <A, B> Function<A, B> createSerializableFunction(frege.run8.Func.U<A, B> f){
			/*final class MyInnerF implements Serializable {
			      public Lazy<B> apply(Lazy<A> la) {
			    	  Func.U myf = new MyFunc.U();
			    	  	//Lazy<B> o = f.apply(la);
			    	  	Lazy<Func.U<A, B>> l1;
			    	  	Kind.U<Func.U<A, ?>, B> k1;
			    	  	Kind.B<Func.U<?, ?>, A, B> k2;
			        //System.out.println("hello");
					return null;
			      }
			    }
			MyInnerF mif = new MyInnerF();
			*/
			bindings.Func.SU t = (bindings.Func.SU) f;
			//FunctionWrapper fw = new FunctionWrapper(f);
			return new Function<A, B>() {
				public B call(A x) {
					frege.run8.Lazy<A> la = frege.run8.Thunk.lazy(x);
					B b = (B) t.apply(la).call();
					return b;
				}
			};
		};
		/*
		 * public static <A, B> Function<A, B> createLambda(Func.U<A, B> f){


    Runnable nonCapturingLambda = () -> System.out.println("NonCapturingLambda");        
    nonCapturingLambda.run();     
    String effectivelyFinal = "effectivelyFinal";         
    A a = null;
 
    Runnable capturingLambda = () -> System.out.println("capturingLambda " + f.apply(Thunk.lazy(a)).call());         
    capturingLambda.run();    
		};
*/
}
