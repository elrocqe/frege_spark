package examples.app;

import static org.apache.spark.sql.functions.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.junit.Assert;

import bindings.FunctionHelper;
import experiments.model.WeatherData;

public class JavaDataSetApp {

    public static void main(String[] args) {
        String file = "data/cassandraDataSmall.csv"; 
  
        List<StructField> fields = Arrays.asList(
                DataTypes.createStructField("line", DataTypes.StringType, true));
              StructType schema = DataTypes.createStructType(fields);
              
          Encoder<WeatherData> weatherEncoder = Encoders.bean(WeatherData.class);
              
        SparkSession session = SparkSession.builder().appName("NumbersTest")
        		.master("local").getOrCreate();
        // inferSchema -> https://issues.apache.org/jira/browse/SPARK-19418
        		Dataset<Row> dataset = session.read().option("inferSchema", true).csv(file);
        		Dataset<Row> namedDataSet = dataset.toDF("stn", "time", "dkl010z0", "fu3010z0", "fu3010z1", "pp0qffs0", "pp0qnhs0", "prestas0", "sre000z0", "rre150z0", "tre200s0", "ure200s0");
        		Dataset<WeatherData> weatherDataSet = namedDataSet.as(weatherEncoder);

        	long countAll = dataset.count();
        	System.out.println("OverallCount: " + countAll);	
        	Dataset<Row> filtered = namedDataSet.filter(col("stn").like("%PLF%"));
        long count = filtered.count();
        	System.out.println("FilteredCount: " + count);
        	Row first = filtered.first();
        System.out.println(filtered.first().get(0));
        //System.out.println(filtered.first().get(4));
        
        WeatherData firstWeatherDataSet = weatherDataSet.first();
        System.out.println(firstWeatherDataSet.getStn());
//        WeatherData firstWeatherDataSet = weatherDataSet.filter(col("stn").like("%PLF%")).first();
        //System.out.println("Typed entry: " + firstWeatherDataSet.getDkl010z0());
        	

        
        
        
        	// TODO add tests in apache spark -> missing junit dependency
        /*
        Assert.assertEquals(7, lines.count());
        Assert.assertEquals(1, filtered.count());
        Assert.assertEquals("5", filtered.select("line"));
         */
        
        	
            //SQLContext sqlContext = new SQLContext(sc);
            //sparkLocation, new String[]{appJar});
            //JavaRDD<String> rdd = sc.textFile(file);
            
         // Creates a DataFrame having a single column named "line"
            /*JavaRDD<Row> rowRDD = rdd.map(RowFactory::create);
            List<StructField> fields = Arrays.asList(
              DataTypes.createStructField("line", DataTypes.StringType, true));
            StructType schema = DataTypes.createStructType(fields);
            Dataset<Row> df = sqlContext.createDataFrame(rowRDD, schema);

            Dataset<Row> errors = df.filter(col("line").like("%ERROR%"));
            // Counts all the errors
            errors.count();
            // Counts errors mentioning MySQL*/
        	
        /*StructField[] structFields = new StructField[]{
                new StructField("intColumn", DataTypes.IntegerType, true, Metadata.empty()),
                new StructField("stringColumn", DataTypes.StringType, true, Metadata.empty())
        };

        StructType structType = new StructType(structFields);

        List<Row> rows = new ArrayList<>();
        rows.add(RowFactory.create(1, "v1"));
        rows.add(RowFactory.create(2, "v2"));
*/
        /*Dataset<Row> df = sparkSession.createDataFrame(rows, structType);

        DataSetResult dataSetResult = SparkUtils.getDataSetResult(df);
        Assert.assertEquals(2, dataSetResult.getColumnNames().size());
        Assert.assertEquals(2, dataSetResult.getRows().size());
        Assert.assertEquals(new Integer(1), dataSetResult.getRows().get(0).get(0));
        Assert.assertEquals("v1", dataSetResult.getRows().get(0).get(1));
        Assert.assertEquals(new Integer(2), dataSetResult.getRows().get(1).get(0));
        Assert.assertEquals("v2", dataSetResult.getRows().get(1).get(1));
        */
        };
    }
