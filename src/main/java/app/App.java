package app;


/**
 * Hello world!
 *
 */
import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.Function;

import bindings.Functions;

public class App {

    public static void main(String[] args) {
        //String sparkLocation = "~/Documents/Code/spark-2.4.0-bin-hadoop2.7";
        //String appJar = "target/P9-spark-1.0-SNAPSHOT.jar";
        String file = "data/cassandraDataSmall.csv"; // Should be some file on your system

        JavaSparkContext sc = new JavaSparkContext("local", "Simple App");
        //sparkLocation, new String[]{appJar});
        JavaRDD<String> rdd = sc.textFile(file);

        // for String
        
        JavaRDD<Double> resultRddForString = rdd
                .filter(Functions.filterHighRainFromString)
        		.map(Functions.getTemperatureFromString);
        
        long countForString = resultRddForString.count();
        Double averageTemperatureForString = resultRddForString
        		.reduce(Functions.getSum);
          		//.reduce((a, b) -> a + b);
        
        // for StringArray
        
        JavaRDD<Double> resultRddForStringArray = rdd
        .map(Functions.parseLineToStringArray)
        .filter(Functions.filterHighRainFromStringArray)
		.map(Functions.getTemperatureFromStringArray);
        
        long countForStringArray = resultRddForStringArray.count();
        Double averageTemperatureForStringArray = resultRddForStringArray
        		.reduce(Functions.getSum);
          		//.reduce((a, b) -> a + b);
        
        // for DataSet
        
        JavaRDD<Double> resultRddForDataSet = rdd
                .map(Functions.parseLineToDataSet)
                .filter(Functions.filterHighRainFromDataSet)
        		.map(Functions.getTemperatureFromDataSet);
        
        long countForDataSet = resultRddForDataSet.count();
        Double averageTemperatureForDataSet = resultRddForDataSet
        		.reduce(Functions.getSum);
          		//.reduce((a, b) -> a + b);
        
        System.out.println("Average temperature of measurements with high rain for String: " + averageTemperatureForString/countForString);
        System.out.println("Average temperature of measurements with high rain for StringArray: " + averageTemperatureForStringArray/countForStringArray);
        System.out.println("Average temperature of measurements with high rain for DataSet: " + averageTemperatureForDataSet/countForDataSet);
    };
    }
