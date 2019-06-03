package experiments.props;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.rdd.RDD;

import scala.reflect.ClassTag;

public class JavaRDDWrapper extends JavaRDD{
	
	public JavaRDDWrapper(RDD rdd, ClassTag classTag) {
		super(rdd, classTag);
		// TODO Auto-generated constructor stub
	}

	public <T> JavaRDD<T>[] randomSplit() {
		double[] a = new double[] {};
		return this.randomSplit(a);
	}

	//
	// filters
	//
	
	public static Function<String, Boolean> equalsOne = new Function<String, Boolean>() {
		public Boolean call(String s) {
			return s.equals("1");
		}
	};
	
}
