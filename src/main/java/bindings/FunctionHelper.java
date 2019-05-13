package bindings;

import java.io.Serializable;
import java.util.UUID;

import org.apache.spark.api.java.function.Function;

import frege.run.Kind;
import frege.run8.Func;
import frege.run8.Lazy;
import frege.run8.Thunk;
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
		
		
		public static <A, B> Function<A, B> createSerializableFunction(Func.U<A, B> f){
			final class MyInnerF implements Serializable {
			      public Lazy<B> apply(Lazy<A> la) {
			    	  	//Lazy<B> o = f.apply(la);
			    	  	Lazy<Func.U<A, B>> l1;
			    	  	Kind.U<Func.U<A, ?>, B> k1;
			    	  	Kind.B<Func.U<?, ?>, A, B> k2;
			        //System.out.println("hello");
					return null;
			      }
			    }
			MyInnerF mif = new MyInnerF();
			return new Function<A, B>() {
				public B call(A x) {
					Lazy<A> la = Thunk.lazy(x);
					B b = mif.apply(la).call();
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
