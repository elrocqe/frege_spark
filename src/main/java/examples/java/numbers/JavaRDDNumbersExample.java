package examples.java.numbers;


import static org.junit.Assert.assertEquals;

import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.Function;

import bindings.FunctionHelper;

public class JavaRDDNumbersExample {

    public static void main(String[] args) {

        String file = "data/first.csv";

        JavaSparkContext sc = new JavaSparkContext("local", "JavaRDD Numbers Example");
        JavaRDD<String> rdd = sc.textFile(file);
        
        JavaRDD<Integer> resultRdd = rdd
    		        .map(line -> Integer.parseInt(line))
                .filter(value -> value == 3 || value == 5)
                .map(x -> x + 1);
        Integer result = resultRdd.reduce((a,b) -> a + b);
        long allCount = rdd.count();
        assertEquals(allCount, 6L);
        long resultCount = resultRdd.count();
        assertEquals(resultCount, 2L);
        Integer resultFirst = resultRdd.first();
        assertEquals(resultFirst, Integer.valueOf(4));
        assertEquals(result, Integer.valueOf(10));
    		};
    }