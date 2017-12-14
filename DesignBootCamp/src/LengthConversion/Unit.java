package LengthConversion;

import java.util.HashMap;
import java.util.Map;

public class Unit {
	
	public static Map<String,Double> actMapping()
	{
		Map<String,Double> maps = new HashMap<String,Double>();
		maps.put("Mile",  (double) 1);
		maps.put("Yard", 0.000568181818);
		maps.put("Feet", 0.00018939393);
		maps.put("Inch", 0.00001578282);
		return maps;
	}
	
	public static double convert(double value,String currentUnit,String desiredUnit)
	{
		Map<String,Double> maps = actMapping();
	double answer = (double) (maps.get(currentUnit)*value)/maps.get(desiredUnit);
	return answer;
	}
	
}
