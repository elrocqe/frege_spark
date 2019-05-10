package bindings;

import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;


public class FuncUWrapper implements Serializable  {
    static HashMap<UUID, frege.run8.Func.U> functions = new HashMap();
   // static HashMap<UUID, frege.run8.Func.U> reducers = new HashMap();
    FuncUWrapper() {
		// TODO Auto-generated constructor stub
	}
    
    
    public static UUID add(frege.run8.Func.U f) {
   	 	  UUID i = UUID.randomUUID();
	     functions.put(i, f);
	     return i;
	}


	public static <A, B>  frege.run8.Func.U getFunction(UUID key) {
		return functions.get(key);
    }


	/*public static UUID add(Func.U<A, Func.U<B, C>> f) {
		// TODO Auto-generated method stub
		 UUID i = UUID.randomUUID();
	     reducers.put(i, f);
	     return i;
	}


	public static <A, B, C> Func.U<A, Func.U<B, C>> getReducer(UUID key) {
		// TODO Auto-generated method stub
		return reducers.get(key);
	}*/
}