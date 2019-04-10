package bindings;

import java.io.Serializable;

import frege.run8.Func;
import frege.run8.Lazy;

class MySerializableFuncWrapper implements Func.U<String, Boolean>, Serializable {

	Func.U<String, Boolean> currentF = null;
	public MySerializableFuncWrapper(Func.U<String, Boolean> f) {
		super();
		this.currentF = f;
	}

	@Override
	public Lazy<Boolean> apply(Lazy<String> arg0) {
		// TODO Auto-generated method stub
		return this.currentF.apply(arg0);
	}
}