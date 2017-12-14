package test;

import static org.junit.Assert.*;

import org.junit.Test;

import stringBasedTax.TaxOnDifferentGoods;

public class TaxOnDifferentGoodsTest {

	TaxOnDifferentGoods taxOnDifferentGoods = new TaxOnDifferentGoods();
	@Test
	public void valueOnBookNonImported() {
		float bookValue = taxOnDifferentGoods.calculateTax("I book at 12.49");
		assertEquals(12.49,bookValue,0.01);
	}
	@Test
	public void valueOnImportedBookNonImported() {
		float bookValue = taxOnDifferentGoods.calculateTax("I imported book at 12.49");
		assertEquals(13.11,bookValue,0.01);
	}

}
