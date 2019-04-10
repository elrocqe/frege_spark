package serialization;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.commons.lang.SerializationUtils;
import org.junit.Test;

import frege.run8.Thunk;
import frege.run8.Func;
import frege.run8.Lazy;

public class SerializationTest {

	@Test
    public void noExceptionThrown() {
    	

    	//https://stackoverflow.com/questions/3840356/how-to-test-in-java-that-a-class-implements-serializable-correctly-not-just-is
    	Func.U<String, String> myObject = new MySerializableFunc();
    	try {
			new ObjectOutputStream(new ByteArrayOutputStream()).writeObject(myObject);
	    	//SerializationUtils.serialize(myObject);
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
 
    @Test(expected = NotSerializableException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() throws IOException {
    	Func.U<String, String> myObject = new MyFunc();
		new ObjectOutputStream(new ByteArrayOutputStream()).writeObject(myObject);

    }
}
class MyFunc implements Func.U<String, String> {

	@Override
	public Lazy<String> apply(Lazy<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class MySerializableFunc implements Func.U<String, String>, Serializable {

	@Override
	public Lazy<String> apply(Lazy<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}



