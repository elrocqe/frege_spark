package scriptengine;

import org.junit.Test;
import javax.script.ScriptException;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import script.ScriptExecutor;

public class ScriptExecutorTests {

	
	/* addOne tests */
    @Test
    public void testAddOne_Double_Success() throws ScriptException, IOException {
    		Double result = ScriptExecutor.executeFunction("addOne", 1.0);
    		assertEquals(result, Double.valueOf(2.0));
    }
    
    @Test(expected = frege.runtime.Undefined.class)
    public void testMiswrittenAddOne_Double_Fail() throws ScriptException, IOException {
    		Double result = ScriptExecutor.executeFunction("miswrittenAddOne", 1.0);
    		assertEquals(result, Double.valueOf(2.0));
    }
    
    @Test(expected = ClassCastException.class)
    public void testAddOne_ParseInteger_Fail() throws ScriptException, IOException {
    		Integer result = ScriptExecutor.executeFunction("addOne", 1.0);
    }
    
    @Test(expected = ClassCastException.class)
    public void testAddOne_Integer_Fail() throws ScriptException, IOException {
    		Integer result = ScriptExecutor.executeFunction("addOne", 1);
    }
    
	/* addValue tests */

    @Test(expected = frege.runtime.Undefined.class)
    public void testAddValue_Double_Success() throws ScriptException, IOException {
    		Double result = ScriptExecutor.executeFunction("addValue", 1.0);
    		assertEquals(result, Double.valueOf(3.0));
    }
    // TODO multiline doesn't work
    
    
	/* filterThirtyOrFifty tests */

    @Test
    public void testfilterThirtyOrFifty_Double_Success() throws ScriptException, IOException {
    		Boolean result = ScriptExecutor.executeFunction("filterThirtyOrFifty", 30.0);
    		assertEquals(result, true);
    }
    
    @Test
    public void testfilterThirtyOrFifty_Double_Fail() throws ScriptException, IOException {
    		Boolean result = ScriptExecutor.executeFunction("filterThirtyOrFifty", 1.0);
    		assertEquals(result, false);
    }
    
	/* sum tests */

    @Test
    public void testSum_Double_Success() throws ScriptException, IOException {
    		Double result = ScriptExecutor.executeFunction2("sum", 1.0, 2.0);
    		assertEquals(Double.valueOf(3.0), result);
    }
    
    @Test
    public void testSum_Integer_Fail() throws ScriptException, IOException {
    		Integer result = ScriptExecutor.executeFunction2("sum", 1, 2);
    		assertEquals(Integer.valueOf(3), result);
    }
    
    @Test
    public void testSum_Integer_Success() throws ScriptException, IOException {
    		Integer result = ScriptExecutor.executeFunction2("sum", 1, 2);
    		assertEquals(Integer.valueOf(3), result);
    }
    
    @Test
    public void testSum_Mixed_Success() throws ScriptException, IOException {
    		Double result = ScriptExecutor.executeFunction2("sum", 1.0, 2);
    		assertEquals(Double.valueOf(3.0), result);
    }
    
    /* timesTenOnString */
    @Test
    public void testTimesTenOnString_Success() throws ScriptException, IOException {
    		String result = ScriptExecutor.executeFunction("timesTenOnString", 2);
    		assertEquals("20", result);
    }
    
    @Test
    public void testTimesTenOnString_Fail2() throws ScriptException, IOException {
    		Double result = ScriptExecutor.executeFunction("timesTenOnString", "2.0");
    		assertEquals("2.00", result);
    }
    
    @Test(expected = frege.runtime.Undefined.class)
    public void testTimesTenOnString_Double_Fail() throws ScriptException, IOException {
    		Double result = ScriptExecutor.executeFunction("timesTenOnString", "2");
    		assertEquals(Double.valueOf(20.0), result);
    }
    
    @Test(expected = frege.runtime.Undefined.class)
    public void testTimesTenOnString_Fail() throws ScriptException, IOException {
    		Double result = ScriptExecutor.executeFunction("timesTenOnString", "2.0");
    		assertEquals(Double.valueOf(20.0), result);
    }
    
    @Test(expected = frege.runtime.Undefined.class)
    public void testTimesTenOnString_Integer_Fail() throws ScriptException, IOException {
    		Double result = ScriptExecutor.executeFunction("timesTenOnString", 2);
    		assertEquals(Double.valueOf(20.0), result);
    }
    
    @Test
    public void testImport_addThree_Success() throws ScriptException, IOException {
    		Double result = ScriptExecutor.executeFunction("addThree", 0.0);
    		assertEquals(Double.valueOf(3.0), result);
    }

    
    @Test
    public void testLoadAndExecuteFunction() throws ScriptException, IOException {
    		Double result = ScriptExecutor.loadAndExecuteScriptFunction("f x = x * 10.0", 1.0);
    		assertEquals(Double.valueOf(10.0), result);
    }
    
    @Test
    public void testLoadAndExecuteStepsFunction() throws ScriptException, IOException {
      	ScriptExecutor scriptExecutor = new ScriptExecutor();
      	scriptExecutor.loadScriptEngine();
		scriptExecutor.frege.eval("f x = x * 10.0");
		Double x = 1.0;
		Double result = (Double) scriptExecutor.frege.eval("f " + x.toString());    		
		assertEquals(Double.valueOf(10.0), result);
    }
    
    
    /*@Test
    public void testLoadAndExecuteFunctionSteps() throws ScriptException, IOException {
		frege.eval("f x = x * 10");
		Double x = 1.0;
		return (B) frege.eval("f " + x.toString());
    }*/

    
    @Test
    public void loadTypeDefinition() throws ScriptException, IOException {
      	ScriptExecutor scriptExecutor = new ScriptExecutor();
      	scriptExecutor.loadScriptEngine();
		Object result = scriptExecutor.frege.eval("test3 :: Int -> Int");
		System.out.println(result);
		System.out.println(result.toString());
    }
    
    @Test
    public void testImportedModule() throws ScriptException, IOException {
      	ScriptExecutor scriptExecutor = new ScriptExecutor();
      	scriptExecutor.loadFunctions();
		Object result = scriptExecutor.frege.eval("addOne 1");
		System.out.println(result);
    }
    
    @Test
    public void multilineTest() throws ScriptException, IOException {
      	ScriptExecutor scriptExecutor = new ScriptExecutor();
      	scriptExecutor.loadFunctions();
		Object result = scriptExecutor.frege.eval("multilineFunction 1.0");
		System.out.println(result);
		assertEquals(Double.valueOf(6.0), result);

    }
    
}
