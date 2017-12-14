package CoffeeVendingMachine;

public interface VendingMachine 
{ 
	public float getPriceOfItem(String item);
	public boolean checkSufficientMoneyInserted(String item,float money);
	public void giveCoffee();
	public float returnMoney(); 
	public void refill();
	}

