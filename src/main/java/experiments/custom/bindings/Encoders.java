package experiments.custom.bindings;

import org.apache.spark.sql.Encoder;

import experiments.model.Department;
import experiments.model.Person;
import experiments.model.WeatherData;

public class Encoders {
	
	public static Encoder<String> stringEncoder = org.apache.spark.sql.Encoders.STRING();
	public static Encoder<Integer> intEncoder = org.apache.spark.sql.Encoders.INT();
	public static Encoder<WeatherData> weatherDataEncoder = org.apache.spark.sql.Encoders.bean(WeatherData.class);
	public static Encoder<Person> personDataEncoder = org.apache.spark.sql.Encoders.bean(Person.class);
	public static Encoder<Department> departmentDataEncoder = org.apache.spark.sql.Encoders.bean(Department.class);

	/*
	 public static <T> Encoder<T> getEncoder(T t) {
		return org.apache.spark.sql.Encoders.bean(T.class);
	}
	*/

}	
