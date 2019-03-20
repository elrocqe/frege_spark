package main.java;

/**
 * Hello world!
 *
 */
import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.Function;

public class App {

    public static void main(String[] args) {
        //String sparkLocation = "~/Documents/Code/spark-2.4.0-bin-hadoop2.7";
        //String appJar = "target/P9-spark-1.0-SNAPSHOT.jar";
        String file = "data/cassandraData.csv"; // Should be some file on your system

        JavaSparkContext sc = new JavaSparkContext("local", "Simple App");
        //sparkLocation, new String[]{appJar});
        JavaRDD<String> rdd = sc.textFile(file);

        /*JavaRDD<Double> resultRdd = rdd
                .filter(Functions.filterHighRainFromString)
        		.map(Functions.getTemperatureFromString);
        */
        
        JavaRDD<Double> resultRdd = rdd
                .map(Functions.parseLine)
                .filter(Functions.filterHighRain)
        		.map(Functions.getTemperature);
                
        long count = resultRdd.count();
        Double averageTemperature = resultRdd
        		.reduce(Functions.getSum);
          		//.reduce((a, b) -> a + b);
        
        System.out.println("Average temperature of measurements with high rain: " + averageTemperature/count);
    };
    }
