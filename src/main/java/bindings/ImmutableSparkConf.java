package bindings;

import org.apache.spark.SparkConf;

public class ImmutableSparkConf extends org.apache.spark.SparkConf {

	SparkConf conf = new SparkConf();
	
	public ImmutableSparkConf(String appName) {
		conf.setMaster("local");
		conf.setAppName(appName);
	}
	
	public SparkConf getSparkConf() {
		return this.conf;
	}

	
	
}
