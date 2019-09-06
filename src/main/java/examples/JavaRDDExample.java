package examples;

import static org.junit.Assert.assertEquals;

import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;

public class JavaRDDExample {

    public static void main(String[] args) {
        JavaSparkContext sc = new JavaSparkContext("local", "JavaRDD Numbers Example");
        JavaRDD<String> rdd = sc.textFile("data/first.csv");
        
        JavaRDD<Double> resultRdd = rdd
    		        .map(line -> Double.parseDouble(line))
                .filter(value -> value == 3.0 || value == 5.0)
                .map(x -> x * 10);
        Double result = resultRdd.reduce((a,b) -> a + b);

        // alternatively
        
         /*JavaRDD<Double> resultRdd = rdd
            .map(line -> Double.parseDouble(line))
            .filter(filterThreeOrFive)
            // alternatively
            //.filter(new Function<Double, Boolean>() {
            //    public Boolean call(Double input) {
            //        return input == 3.0 || input == 5.0;
            //    }})
            .map(timesTen);
        Double result = resultRdd.reduce(getSum);
        */     
        long allCount = rdd.count();
        assertEquals(6L, allCount);
        long resultCount = resultRdd.count();
        assertEquals(2L, resultCount);
        Double resultFirst = resultRdd.first();
        assertEquals(4.0,resultFirst, 0); // 0 = delta precision loss
        assertEquals(10.0, result, 0);
        sc.close();
    	};
    	
    	public static Function<Double, Boolean> filterThreeOrFive = new Function<Double, Boolean>() {
            public Boolean call(Double input) {
                return input == 3.0 || input == 5.0;
            }
    };
    
	public static Function<Double, Double> timesTen = new Function<Double, Double>() {
        public Double call(Double input) {
            return input * 10.0;
        }
	};

    public static Function2<Double, Double, Double> getSum = new Function2<Double, Double, Double>() {
            public Double call(Double x, Double y) {
                return x + y;
            }
    };

}