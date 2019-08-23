package functions;

public class JavaFunctionPool {

	  public static Double addTwo(Double x) {
		  return x + 2.0;
	  }
	  
	  public static Double sum(Double x, Double y) {
		  return x + y;
	  }
	  
	  public static <A extends Number> A timesTenGeneric(A x) {
		  if (x instanceof Double) {
              return (A) new Double(x.doubleValue() * 10);
          } else if (x instanceof Integer) {
              return (A) new Integer(x.intValue() * 10);
          } else {
              throw new IllegalArgumentException("Type " + x.getClass() + " is not supported by this method");
          }	  
	  }
}
