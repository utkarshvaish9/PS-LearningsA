package CoffeeVendingMachine;

import java.util.HashMap;
import java.util.Map;

public class CoffeeVendingMachine implements VendingMachine
{

	 Map<String,Float> typesOfCoffee = new HashMap<>();
	 private final float MACHINE_COFFEE_CAPACITY = (float) 1000.0;
	 private float machineChangeAvailable = (float) 1000.0;

	
	public CoffeeVendingMachine()
	{
		typesOfCoffee.put("black",(float) 0.35);
		typesOfCoffee.put("blackWithSugar",(float) 0.35);
		typesOfCoffee.put("blackWithCream",(float) 0.35);
		typesOfCoffee.put("blackWithSugarAndCream",(float) 0.35);
		
	}
	
	public float getPriceOfItem(String item)
	{
		return typesOfCoffee.get(item);
	}
	public 
	public boolean checkSufficientMoneyInserted(String item,float money)
	{
		if(money<=typesOfCoffee.get(item))
			return false;
		return true;
		
	}
	public float returnMoney(String item,float money)
	{
		if(checkSufficientMoneyInserted(item, money))
			return money - typesOfCoffee.get(item);
		return new notEnoughMoneyException;
	}
	
}
