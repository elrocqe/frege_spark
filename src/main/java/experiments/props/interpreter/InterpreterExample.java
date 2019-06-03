package experiments.props.interpreter;

import javax.script.Bindings;
import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

import java.math.BigInteger;
import java.util.List;

import static javax.script.ScriptContext.ENGINE_SCOPE;

import frege.compiler.types.Global.TGlobal;
import frege.control.arrow.Kleisli.TKleisli;
import frege.control.monad.State.TStateT;
import frege.interpreter.FregeInterpreter;
import frege.interpreter.FregeInterpreter.TInterpreterConfig;
import frege.interpreter.FregeInterpreter.TInterpreterResult;
import frege.interpreter.javasupport.InterpreterClassLoader;
import frege.prelude.PreludeBase;
import frege.run8.Func;
import frege.run8.Func.U;
import frege.run8.Thunk;
import frege.runtime.Phantom.RealWorld;
import  frege.scriptengine.FregeScriptEngine;

public class InterpreterExample {
    
	    public static void main(String[] args) {
	    	
			final ScriptEngineManager factory = new ScriptEngineManager();
			ScriptEngine frege = factory.getEngineByName("frege");
			try {
				// scripting engine evalutes '1 + 1', result is 2
				int	a = (Integer) frege.eval("1+1");
				assert (a == 2);
				System.out.println(a);
				
				// add the function f to the TODO
				frege.eval("f x y = x + y");
				// execute function on parameters
				int b = (Integer) frege.eval("f 1 2");
				assert (b == 2);
				System.out.println(b);

				System.out.println(b);
		        System.out.println("end");
			} catch (ScriptException e) {
				e.printStackTrace();
			}
			
	    	/*
			final ScriptEngineManager factory = new ScriptEngineManager();
			ScriptEngine frege = factory.getEngineByName("frege");
			
			System.out.println(frege.eval("1 + 1"));
			*/
	    }

}
