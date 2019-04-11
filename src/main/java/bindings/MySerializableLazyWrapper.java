package bindings;

import java.io.Serializable;

import frege.run8.Func;
import frege.run8.Lazy;

class MySerializableLazyWrapper implements Lazy, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 618333914034283409L;
	Lazy currentL = null;
	public MySerializableLazyWrapper(Lazy l) {
		super();
		this.currentL = l;
	}

	@Override
	public Object call() {
		// TODO Auto-generated method stub
		return currentL.call();
	}
}