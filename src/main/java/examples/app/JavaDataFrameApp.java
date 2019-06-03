package examples.app;
import static org.apache.spark.sql.functions.*;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

public class JavaDataFrameApp {

    public static void main(String[] args) {
        String file = "data/first.csv"; // Should be some file on your system

        JavaSparkContext sc = new JavaSparkContext("local", "Simple App");
         
        SQLContext sqlContext = new SQLContext(sc);
        //sparkLocation, new String[]{appJar});
        JavaRDD<String> rdd = sc.textFile(file);
        
     // Creates a DataFrame having a single column named "line"
        JavaRDD<Row> rowRDD = rdd.map(RowFactory::create);
        List<StructField> fields = Arrays.asList(
          DataTypes.createStructField("line", DataTypes.StringType, true));
        StructType schema = DataTypes.createStructType(fields);
        Dataset<Row> df = sqlContext.createDataFrame(rowRDD, schema);

        Dataset<Row> errors = df.filter(col("line").like("%ERROR%"));
        // Counts all the errors
        errors.count();
        // Counts errors mentioning MySQL
        long countAll = df.count();
        System.out.println(countAll);        
        long count = df.filter(col("line").like("%5%")).count();
        System.out.println(count);

   };
    }
