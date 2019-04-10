package numbers;

import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.Function;

import bindings.Functions;

public class RDDNumbersExample {

    public static void main(String[] args) {

        String file = "data/first.csv";

        JavaSparkContext sc = new JavaSparkContext("local", "JavaRDD Numbers Example");
        JavaRDD<String> rdd = sc.textFile(file);
        
        JavaRDD<Integer> resultRdd = rdd
    		        .map(line -> Integer.parseInt(line))
                .filter(value -> value == 5 || value == 3);
        
        Integer result = resultRdd.reduce((a,b) -> a + b);
        long allCount = rdd.count();
        System.out.println(allCount);
        long filteredCount = resultRdd.count();
        System.out.println(filteredCount);
        Integer filteredFirst = resultRdd.first();
        System.out.println(filteredFirst);
        System.out.println("Result: " + result);
    		};
    }