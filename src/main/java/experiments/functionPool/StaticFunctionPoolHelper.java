package experiments.functionPool;

import java.util.UUID;

import org.apache.spark.api.java.function.Function;

import frege.run8.Func;
import frege.run8.Thunk;

public class StaticFunctionPoolHelper {

	public static <A, B> Function<A, B> createFunction(Func.U<A, B> f) {
		UUID i = FunctionPool.add(f);
		return new Function<A, B>() {
			public B call(A x) {
				Func.U f = FunctionPool.getFunction(i);
				Object o = f.apply(Thunk.lazy(x)).call();
				return (B) o;
			}
		};
	};
}
