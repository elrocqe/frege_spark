package numbers;

import java.lang.reflect.Method;

import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.Function;
import bindings.FunctionHelper;
import frege.run7.Func;

public class IntegrationExampleJava {

	/*public static Function<Double, Boolean> createBasicFilterFunction(Object function){
	    Method method = null;
		try {
		    Class<?> c = Class.forName("computations.BasicFregeFunction");
			method = c.getDeclaredMethod("filterThreeOrFive", Double.class);
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Function<Double, Boolean>() {
			@Override
			public Boolean call(Double input) throws Exception {
				// TODO Auto-generated method stub
				return (Boolean) method.invoke(null, input);
			}
		};
	};*/
	public static Function<Double, Boolean> createNonSerializableFunction(){		
		NonSerializableObject test = new NonSerializableObject();

		return new Function<Double, Boolean>() {
			@Override
			public Boolean call(Double input) throws Exception {
				// TODO Auto-generated method stub
				return input == 5.0;
			}
		};
	};
	
    public static void main(String[] args) {

        String file = "data/first.csv";

        JavaSparkContext sc = new JavaSparkContext("local", "JavaRDD Numbers Example");
        JavaRDD<String> rdd = sc.textFile(file);
        
        JavaRDD<Double> resultRdd = rdd
    		        .map(line -> Double.parseDouble(line));
                //.filter(value -> value == 5 || value == 3);
        System.out.println(computations.BasicFregeFunction.myNumber);
    	    Function<Double, Boolean> filterThreeOrFive = new Function<Double, Boolean>() {
            public Boolean call(Double input) {
                return computations.BasicFregeFunction.filterThreeOrFive(input);
                //.filterThreeOrFive.apply(input).call();
            }
    	    };
    	    
    	    
    	    
    	    //createBasicFilterFunction(computations.BasicFregeFunction.filterThreeOrFive);
    	    
    	    
        //JavaRDD<Double> filteredRdd = resultRdd.filter(value -> value == 5.0 || value == 3.0);
        //JavaRDD<Double> filteredRdd = resultRdd.filter(filterThreeOrFive);
        
        Function<Double, Boolean> a = createNonSerializableFunction();
        JavaRDD<Double> filteredRdd = resultRdd.filter(a);

       // Integer result = resultRdd.reduce((a,b) -> a + b);
        long allCount = resultRdd.count();
        System.out.println(allCount);
        long filteredCount = filteredRdd.count();
        System.out.println(filteredCount);
        Double filteredFirst = filteredRdd.first();
        System.out.println(filteredFirst);
        //System.out.println("Result: " + result);
    		};
    }