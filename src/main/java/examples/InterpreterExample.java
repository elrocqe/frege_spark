package examples;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class InterpreterExample {
    
	    public static void main(String[] args) throws ScriptException {
	    	
	    	final ScriptEngineManager factory = new ScriptEngineManager();
	    	ScriptEngine frege = factory.getEngineByName("frege");
	    	// scripting engine evalutes '1 + 1', result is 2
	    	int	a = (Integer) frege.eval("1+1");
	    	assert (a == 2);
	    	System.out.println(a);
	    					
	    	// load the function f into the context 
	    	frege.eval("f x y = x + y");
	    	// execute function on parameters
	    	int b = (Integer) frege.eval("f 1 2");
	    	assert (b == 2);
	    	System.out.println(b);
	    }
}
