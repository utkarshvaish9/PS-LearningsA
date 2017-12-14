package BillCalculator;

import java.util.HashMap;
import java.util.Map;

public class BillCalculate {
	
	
	Map<String,Float> basicMonthlyRate = new HashMap<>();
	Map<String,Integer> includedMinutes = new HashMap<>();
	Map<String,Float> additionalRate = new HashMap<>();
	Map<String,Float> additionalLineRate = new HashMap<>();
	private final int flatRate = 5;
	public BillCalculate()
	{
		basicMonthlyRate.put("GOLD", (float) 49.95);
		includedMinutes.put("GOLD", 1000);
		additionalRate.put("GOLD", (float) 0.45);
		additionalLineRate.put("GOLD", (float) 14.5);
		basicMonthlyRate.put("SILVER", (float) 29.95);
		includedMinutes.put("SILVER", 500);
		additionalRate.put("SILVER", (float) 0.54);
		additionalLineRate.put("SILVER", (float) 21.5);
		
	}
	public float calculateBill(String plan,int minutes,int numberOfLines)
	{
		float bill =  basicMonthlyRate.get(plan) + Math.max(minutes-includedMinutes.get(plan),0 )*additionalRate.get(plan) 
					+ Math.min(numberOfLines-1,2)*additionalLineRate.get(plan) + Math.max(numberOfLines-3,0)* flatRate;
		return bill;
	}
	
	
	
}
