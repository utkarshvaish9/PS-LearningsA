package stringBasedTax;

import java.util.HashMap;
import java.util.Map;

public class TaxOnDifferentGoods {
	private static final int IMPORTED = 5;
	private static final int EXEMPTED = 0;
	private static final int SALES_TAX = 10;
	Map<String,Integer> map1 = new HashMap<>();
	
	public TaxOnDifferentGoods()
	{
		map1.put("book", EXEMPTED);
		map1.put("music", SALES_TAX);
		map1.put("chocolate", EXEMPTED);
		map1.put("imported", IMPORTED);
		map1.put("at", 0);
	}

	public float calculateTax(String str) {
		String []splited = str.split("\\s+");
		float getFloatValue = Float.parseFloat((str.replaceAll("[\\D]", "")));
		float tax = getFloatValue*map1.get(splited[1])/10000 
					+ getFloatValue/100 + map1.get(splited[2])*getFloatValue/10000;
		
		return tax;
	}

}
