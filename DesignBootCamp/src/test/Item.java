package test;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private static final double ImportTax = 0.05;
	private static final double SALES_TAX = 0.1;
	private final String category;
	private static  boolean imported;
	private final double costPrice;
	private static float cost;
	
	private static List<String> exempted = new ArrayList<>();
	public Item(String category,boolean imported,double costPrice)
	{
		this.category = category;
		Item.imported = imported;
		this.costPrice = costPrice;
		exempted.add("book");
		exempted.add("medical");
		exempted.add("food");
	}

	
	public static  float calculatedCost(ArrayList<Item> itemslist) {
		for(Item item: itemslist)
		{
		cost = (float) (item.costPrice + ifItemInExemptedList(exempted, item.category)*SALES_TAX*item.costPrice
				+ ifItemImported(Item.imported)*ImportTax*item.costPrice);
		}
		return cost;
	}
	
	private static  int ifItemInExemptedList(List<String> exempted,String category)
	{
		if(exempted.contains(category))
			return 0;
		return 1;
	}
	private static  int ifItemImported(boolean imported)
	{
		if(imported)
			return 1;
		return 0;
	}

}
