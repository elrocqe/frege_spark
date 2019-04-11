package bindings;

import java.io.Serializable;

import frege.run8.Func;
import frege.run8.Lazy;
import frege.run8.Thunk;

class MySerializableFuncWrapper implements Func.U<String, String>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 618333914034283409L;

	SerializableFunc.U<String, String> a = null;
	public MySerializableFuncWrapper(Func.U<String, String> f) {
		super();
		this.a = (x-> f.apply(x));//Thunk.lazy("lazy"));//).apply(x));
	}

	@Override
	public Lazy<String> apply(Lazy<String> arg0) {
		// TODO Auto-generated method stub
		return this.a.apply(arg0);
	}
	

}