package bindings;

import org.apache.spark.sql.Encoder;

import model.WeatherData;

public class Encoders {
	
	public static Encoder<String> stringEncoder = org.apache.spark.sql.Encoders.STRING();
	public static Encoder<Integer> intEncoder = org.apache.spark.sql.Encoders.INT();
	//public static Encoder<WeatherData> weatherDataEncoder = Encoders.bean(WeatherData.class);
}	
