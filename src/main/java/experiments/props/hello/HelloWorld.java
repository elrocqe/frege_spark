package experiments.props.hello;

import frege.prelude.PreludeBase.TList;
import frege.prelude.PreludeText.IShow_$lbrack$rbrack;
import frege.prelude.PreludeText.IShow_Int;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Arrays;
import java.util.List;

//import static frege.runtime.Delayed.forced;

public class HelloWorld {
	public static void main(String[] args) throws Exception {
		// Get Frege Script Engine
		final ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine frege = factory.getEngineByName("frege");

		// Evaluate a simple expression
		System.out.println("Result of 1 + 2 from Frege: " + frege.eval("1 + 2"));

		// Define a frege function
		frege.eval("add x y = x + y");

		// Call the previously defined function
		int sum = (Integer) frege.eval("add 5 3");
		System.out.println("Sum: " + sum);
		/*
		 * // Evaluate an expression that gives a Frege value TList fregeList = (TList)
		 * frege.eval("filter even [1..10]");
		 * System.out.println("Showing Frege List from Java: " +
		 * forced(IShow_$lbrack$rbrack.show(IShow_Int.it, fregeList)));
		 * 
		 * // Pass something from Java List<Integer> javaList = Arrays.asList(1, 2, 3,
		 * 4, 5); frege.eval("import Java.Util(List)");
		 * frege.put("javaList :: Mutable s (List Int)", javaList);
		 * 
		 * final String fregeListAsString = (String)
		 * frege.eval("show . IO.performUnsafe $ javaList.iterator >>= _.toList");
		 * System.out.println("Frege List from Java List as String: " +
		 * fregeListAsString);
		 * 
		 * // Evaluate a module frege.eval( "module hello.Hello where\n" +
		 * "fib = 0 : 1 : zipWith (+) fib (tail fib)");
		 * frege.eval("import hello.Hello");
		 * System.out.println("First 10 fibonacci numbers calculated from module: " +
		 * frege.eval("show . take 10 $ fib"));
		 */
	}
}