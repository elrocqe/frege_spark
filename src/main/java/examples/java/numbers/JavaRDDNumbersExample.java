package examples.java.numbers;

import static org.junit.Assert.assertEquals;

import org.apache.spark.api.java.*;

public class JavaRDDNumbersExample {

    public static void main(String[] args) {
        JavaSparkContext sc = new JavaSparkContext("local", "JavaRDD Numbers Example");
        JavaRDD<String> rdd = sc.textFile("data/first.csv");
        
        JavaRDD<Double> resultRdd = rdd
    		        .map(line -> Double.parseDouble(line))
                .filter(value -> value == 3.0 || value == 5.0)
                .map(x -> x + 1);
        Double result = resultRdd.reduce((a,b) -> a + b);
        long allCount = rdd.count();
        assertEquals(6L, allCount);
        long resultCount = resultRdd.count();
        assertEquals(2L, resultCount);
        Double resultFirst = resultRdd.first();
        assertEquals(4.0,resultFirst, 0); // 0 = delta precision loss
        assertEquals(10.0, result, 0);
        sc.close();
    	};
}