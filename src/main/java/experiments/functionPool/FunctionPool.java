package experiments.functionPool;

import java.util.HashMap;
import java.util.UUID;

public class FunctionPool {
    static HashMap<UUID, frege.run8.Func.U> functions = new HashMap();
    
    public static UUID add(frege.run8.Func.U f) {
   	 	  UUID i = UUID.randomUUID();
	     functions.put(i, f);
	     return i;
	}

	public static <A, B>  frege.run8.Func.U getFunction(UUID key) {
		return functions.get(key);
    }
}