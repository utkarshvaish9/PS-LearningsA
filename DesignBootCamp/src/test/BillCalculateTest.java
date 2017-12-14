package test;



//import org.junit.Assert;
import org.junit.Test;

import BillCalculator.BillCalculate;
import junit.framework.Assert;


public class BillCalculateTest {

	@Test
	public void shouldCalculateForGoldMemberWithLessThanThousandMinutesAndMoreThanThreeLines()
	{
		BillCalculate billCalculate = new BillCalculate();
		float billAmount = billCalculate.calculateBill("GOLD", 878, 4);
		Assert.assertEquals((float) 83.95, billAmount,0.01);
	}
	@Test
	public void shouldCalculateForGoldMemberWithMoreThanThousandMinutesAndOneLine()
	{
		BillCalculate billCalculate = new BillCalculate();
		float billAmount = billCalculate.calculateBill("GOLD", 1123, 1);
		Assert.assertEquals((float) 105.30, billAmount,0.01);
		
	}
	@Test
	public void shouldCalculateForGoldMemberWithMoreThanThousandMinutesAndMoreThanThreeLines()
	{
		BillCalculate billCalculate = new BillCalculate();
		float billAmount = billCalculate.calculateBill("GOLD", 1123, 4);
		Assert.assertEquals((float) 139.30, billAmount,0.01);
		
	}
	@Test
	public void shouldCalculateForSilverMemberWithMoreThanFiveHundredMinutesAndMoreThanOneLine()
	{
		BillCalculate billCalculate = new BillCalculate();
		float billAmount = billCalculate.calculateBill("SILVER", 523, 2);
		Assert.assertEquals((float) 63.87, billAmount,0.01);
		
	}
	@Test
	public void shouldCalculateForSilverMemberWithLessThanFiveHundredMinutesAndMoreThanThreeLine()
	{
		BillCalculate billCalculate = new BillCalculate();
		float billAmount = billCalculate.calculateBill("SILVER", 44, 5);
		Assert.assertEquals((float) 82.95, billAmount,0.01);
		
	}
	@Test
	public void shouldCalculateForSilverMemberWithMoreThanFiveHundredMinutesAndMoreThanThreeLine()
	{
		BillCalculate billCalculate = new BillCalculate();
		float billAmount = billCalculate.calculateBill("SILVER", 521, 5);
		Assert.assertEquals((float) 94.29, billAmount,0.01);
		
	}
}
