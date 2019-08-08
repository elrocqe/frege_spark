package experiments.props;

import org.apache.spark.api.java.function.Function;

import experiments.props.Func.SU;

public class Props {


	
	
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
		//bindings.Func.SU t = (bindings.Func.SU) f;
		//FunctionWrapper fw = new FunctionWrapper(f);
		return new Function<A, B>() {
			public B call(A x) {
				frege.run8.Lazy<A> la = frege.run8.Thunk.lazy(x);
				//B b = (B) t.apply(la).call();
				return null;// b;
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
