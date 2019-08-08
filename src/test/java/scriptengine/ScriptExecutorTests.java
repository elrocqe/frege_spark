package scriptengine;

import org.junit.Before;
import org.junit.Test;

import javax.script.Bindings;
import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.io.IOException;
import java.math.BigInteger;

import static javax.script.ScriptContext.ENGINE_SCOPE;
import static org.junit.Assert.assertEquals;

import  frege.scriptengine.FregeScriptEngine;
import  frege.scriptengine.FregeScriptEngineFactory;
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
}
