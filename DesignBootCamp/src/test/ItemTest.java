package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ItemTest {
	
private static final ArrayList<Item> itemsList = new ArrayList<>();

	
	@Test
	public void costForOneExemptedAndDomesticGoods()
	{	
		Item item = new Item("book",false,12.49);
		itemsList.add(item);
	assertEquals(12.49,Item.calculatedCost(itemsList),0.01);
	}
	
	@Test
	public void costForOneDomesticAndUnExemptedItem()
	{	
		Item item = new Item("music",false,14.99);
		itemsList.add(item);
		assertEquals(16.49,Item.calculatedCost(itemsList),0.01);
	}
	@Test
	public void costForOneImportedAndExemptedItem()
	{	
		Item item = new Item("book",true,14.99);
		itemsList.add(item);
		assertEquals(15.73,Item.calculatedCost(itemsList),0.01);
	}
	@Test
	public void costForOneImportedAndUnExemptedItem()
	{	
		Item item = new Item("music",true,14.99);
		itemsList.add(item);
		assertEquals(17.23,Item.calculatedCost(itemsList),0.01);
	}
	@Test
	public void costForMoreThanOneDomesticdAndExemptedItem()
	{			Item item1 = new Item("book",false,12.49);
				Item item2= new Item("food",false,13.49);
				itemsList.add(item1);
				itemsList.add(item2);
				
		assertEquals(14.36,Item.calculatedCost(itemsList),0.01);
	}
	
}
