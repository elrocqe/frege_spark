package examples.numbers;

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
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.DataFrameReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.SparkSession.Builder;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.junit.Assert;

import bindings.FunctionHelper;
import experiments.props.FilterFunctions;
import experiments.props.MapFunctions;
import experiments.props.ReduceFunctions;

public class DataSetNumbersJavaExample {

    public static void main(String[] args) {
        String file = "data/first.csv"; 
  
        Builder builder = SparkSession.builder().appName("NumbersTest").master("local");
        	SparkSession session = builder.getOrCreate();
    		DataFrameReader dataFrameReader = session.read().option("inferSchema","true");
    		Dataset<Row> initialDataSet = dataFrameReader.csv(file);
    		Dataset<Row> dataSet = initialDataSet.toDF("line");	
    		//Dataset<Row> lines = dataset.select("line");
        	long countAll = initialDataSet.count();
        	System.out.println("OverallCount: " + countAll);	
        	
        	// as string
        //	Dataset<Row> filtered = initialDataSet.filter(col("_c0").like("%5%"));
        	Dataset<Row> filtered = dataSet.filter(col("line").like("%5%"));
        long count = filtered.count();
        	System.out.println("FilteredCount: " + count);
        System.out.println(filtered.first().get(0));
        // as integer
        
        Dataset<Integer> integerDataSet = dataSet.as(Encoders.INT());
	    	Dataset<Integer> filteredInteger = integerDataSet.filter(col("line").equalTo(5).or(col("line").equalTo(3)));
	    long countInteger = filteredInteger.count();
	    	System.out.println("FilteredCount: " + countInteger);
	    System.out.println(filteredInteger.first());
	    
       	Dataset<Integer> mappedInteger = filteredInteger.map(MapFunctions.addOneMF, Encoders.INT());
	    //Integer result = mappedInteger.reduce(ReduceFunctions.getIntegerSum);
	    Integer result = mappedInteger.reduce((a,b) -> a + b);
	    System.out.println("Result: " + result);
       // 	List<Integer> list = resultDataSet.collectAsList();
        	
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
