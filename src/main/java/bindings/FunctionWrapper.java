package bindings;

import java.io.Serializable;

import org.apache.spark.api.java.function.Function;

import frege.run8.Func.U;
import frege.run8.Lazy;
import frege.run8.Thunk;

public class FunctionWrapper<A, B> implements Function<A, B>, Serializable {
    protected frege.run8.Func.U lambda;

    public FunctionWrapper(frege.run8.Func.U<A,B> f) {
        this.lambda = ( frege.run8.Func.U) f;
    }

	@Override
	public B call(A v1) throws Exception {
		return (B)lambda.apply(Thunk.lazy(v1)).call();
	}
}
    /*
public class FunctionWrapper<A, B> implements frege.run8.Func.U<A, B>, Serializable {
    protected frege.run8.Func.U lambda;

    
    public FunctionWrapper(frege.run8.Func.U<A,B> f) {
        this.lambda = ( frege.run8.Func.U & Serializable) f;
    }


/*
	@Override
	public Lazy<B> apply(Lazy<A> arg0) {
		B b = (B)lambda.apply(arg0).call();
		frege.run8.Lazy<B> lb = frege.run8.Thunk.lazy(b);
		return lb;
	}
}*/