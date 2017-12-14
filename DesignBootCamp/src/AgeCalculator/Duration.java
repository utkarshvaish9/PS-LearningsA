package AgeCalculator;

import java.util.Date;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Duration {

	static final long MILLIS_IN_HOURS = 1000L *60*60;
	 static final long MILLIS_IN_DAYS = MILLIS_IN_HOURS*24;
	 static final long MILLIS_IN_MONTHS= MILLIS_IN_DAYS*30;
	 static final long MILLIS_IN_YEARS = MILLIS_IN_MONTHS*12;
	
	private final TreeMap<Long, String> treeMap; 
	public Duration()
	{
		treeMap  = new TreeMap<>();
		treeMap.put(MILLIS_IN_HOURS, "Hours");
		treeMap.put(MILLIS_IN_DAYS, "Days");
		treeMap.put(MILLIS_IN_MONTHS, "Months");
		treeMap.put(MILLIS_IN_YEARS, "Years");		
	}

	public String since(Date date) {
		long delta = deltaInMillis(date);
		Entry<Long, String> closeMatch = treeMap.floorEntry(delta);
		long age = delta/closeMatch.getKey();
		return age + " " + closeMatch.getValue();
		// TODO Auto-generated method stub
		
	}
	public void register(long l,String newDuration)
	{
		treeMap.put(l, newDuration);
	}

	private long deltaInMillis(Date date) {
		// TODO Auto-generated method stub
		return System.currentTimeMillis() - date.getTime() ;
	}
	
	

}
