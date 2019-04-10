package bindings;
import static org.junit.Assert.assertNotNull;

import java.io.Serializable;

import frege.run.Kind;
import frege.run8.Lazy;
import bindings.FuncI.U;


public class MyFunc {
	


	public class U<T1, T2> implements FuncI.U<String, Boolean>, Serializable {
		private static final long serialVersionUID = -3157507877317885555L;
		frege.run8.Func.U<String, Boolean> function;
		public U(frege.run8.Func.U<String, Boolean> f) {
			this.function = f;
			// TODO Auto-generated constructor stub
		}

		@Override
		public Lazy<Boolean> apply(Lazy<String> a) {
			// TODO how to implement apply?
			return this.function.apply(a);
		}
	}

	// TODO is this the way to go to make Func.U serializable?
    
  }