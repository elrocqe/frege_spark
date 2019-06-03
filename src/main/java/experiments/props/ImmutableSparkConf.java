package experiments.props;

import org.apache.spark.SparkConf;

public class ImmutableSparkConf extends org.apache.spark.SparkConf {

	
	public ImmutableSparkConf(String appName) {
		this.setMaster("local");
		this.setAppName(appName);
	}	
}
