package experiments.functionPool;

import java.util.UUID;

import org.apache.spark.api.java.function.Function2;

import frege.run8.Func;
import frege.run8.Thunk;

public class StaticFunction2PoolHelper {
	
	public static <A, B, C> Function2<A, B, C> createFunction2(Func.U<A, Func.U<B, C>> f){
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
