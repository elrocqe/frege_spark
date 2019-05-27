package script;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptReader {
    
    // https://stackoverflow.com/questions/1463192/reading-content-of-a-jar-file-at-runtime
    
    private static void process(InputStream input, String functionName, ScriptEngine frege) throws IOException, ScriptException {
        InputStreamReader isr = new InputStreamReader(input);
        BufferedReader reader = new BufferedReader(isr);
        String line;

        while ((line = reader.readLine()) != null) {
            //System.out.println(line);
            if (isWantedFunction(line, functionName)) {
                System.out.println("Found function: " + line);
                 String script = line.trim();
      			frege.eval(script);
                System.out.println(script);

            }
        }
        reader.close();
    }

    private static boolean isWantedFunction(String line, String string) {
		if (line.contains(string) && !line.contains("::")) {
			return true;
		}
		return false;
	}

	public static void main(String arg[]) throws IOException, ScriptException {
		long startTime = System.currentTimeMillis();
		executeScript();
	    long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("First: " + elapsedTime);
	    
		startTime = System.currentTimeMillis();
		executeFunctionFromJar("addOne", 1.0);
	    stopTime = System.currentTimeMillis();
	    elapsedTime = stopTime - startTime;
	    System.out.println("Second: " + elapsedTime);
	   }

    public static void executeScript() throws IOException, ScriptException {
   		final ScriptEngineManager factory = new ScriptEngineManager();
   		ScriptEngine frege = factory.getEngineByName("frege");
   		frege.eval("addOne x = x + 1.0");
			// execute function on parameters
			double b = (Double) frege.eval("addOne 1.0");
			assert (b == 2.0);
			System.out.println(b);
	        System.out.println("end");
    }	

	
	public static <A> Object executeFunctionFromJar(String functionName, A x) throws IOException, ScriptException {
    	   JarFile jarFile = new JarFile("frege-spark.jar");
           System.out.println(functionName);
           System.out.println(x);
   		final ScriptEngineManager factory = new ScriptEngineManager();
   		ScriptEngine frege = factory.getEngineByName("frege");

   		// TODO either load all or single lines
           final Enumeration<JarEntry> entries = jarFile.entries();
           while (entries.hasMoreElements()) {
               final JarEntry entry = entries.nextElement();
               if (entry.getName().contains(".")) {
                   //System.out.println("File : " + entry.getName());
                   if (entry.getName().contains("FunctionPool.fr")) { 
                     JarEntry fileEntry = jarFile.getJarEntry(entry.getName());
                     InputStream input = jarFile.getInputStream(fileEntry);
                     process(input, functionName, frege);

         			// add the function f to the TODO
         			/*double b = (Double) frege.eval(functionName + " " + x);
         			assert (b == 2.0);
         			System.out.println(b);
         	        System.out.println("end");
         	        return b;*/
                   }
        			// execute function on parameters
               }
           }
	     return frege.eval(functionName + " " + x.toString());
       }
}
