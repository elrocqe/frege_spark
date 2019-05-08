package bindings;

import java.io.Serializable;

import frege.run8.Func;
import frege.run8.Func.U;

public class SerializableFunction implements Serializable {
	
	private Func.U<Double, Double> f;

	public SerializableFunction(U<Double, Double> f) {
		super();
		this.f = f;
	}

	public Func.U<Double, Double> getF() {
		return f;
	}

	public void setF(Func.U<Double, Double> f) {
		this.f = f;
	}
	
	
	
	

}
