package bindings;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class JavaSparkContextFromImmutableConf extends org.apache.spark.SparkConf {

	//SparkConf conf = new SparkConf();
	private JavaSparkContext context;
	
	public JavaSparkContextFromImmutableConf(ImmutableSparkConf conf) {
		this.context = new JavaSparkContext(conf);
	}
	
	public JavaSparkContext getSparkContext() {
		return this.context;
	}

	
	
}
