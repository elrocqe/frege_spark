package experiments.props;

import frege.run8.Func.U;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import frege.run8.Func;
import frege.run8.Lazy;

public class MyFunc implements frege.run8.Func.U, Serializable {
	
	protected frege.run8.Func.U current;
	
	

	public MyFunc(U current) {
		//this.current = (Func.U & Serializable )current;

		this.current = (Func.U & Serializable) current;
}



	@Override
	public Lazy apply(Lazy arg0) {
		return current.apply(arg0);
	}

	/*
	private void writeObject(ObjectOutputStream out) throws IOException {
		  // not required the default write object
		  // ----> out.defaultWriteObject();
		  out.writeObject(this);
	 }

	 private void readObject(ObjectInputStream in) throws IOException {
	  // not required the default read object
	  // ----> in.defaultReadObject();
	  try {
	   MyFunc c = (MyFunc)in.readObject();
	   this.current = c;
	  } catch (ClassNotFoundException e) {
	   e.printStackTrace();
	  }
	 }
	  */
}
