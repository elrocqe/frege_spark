package bindings;

import org.apache.spark.SparkConf;

public class ImmutableSparkContext extends org.apache.spark.SparkConf {

	SparkConf conf = new SparkConf();
	
	public ImmutableSparkContext(String appName) {
		conf.setMaster("local");
		conf.setAppName(appName);
	}
	
	public SparkConf getSparkConf() {
		return this.conf;
	}

	
	
}
