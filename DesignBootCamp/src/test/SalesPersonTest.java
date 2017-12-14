package test;

import static org.junit.Assert.*;

import org.junit.Test;


public class SalesPersonTest {

	private static final double QUOTA = 1000;
	private static final double PRECISION = 0.01;
	private static final double COMMISION_PERCENTAGE = 10;
	private final SalespPerson salesPerson = new SalespPerson(QUOTA,COMMISION_PERCENTAGE);
	private double sales;
	private int teamMember;
	@Test
	public void noTeamBonusForPoorPerformance() {
		forSalesOf(QUOTA-1).bonusIs(0);
	}
	@Test
	public void noTeamBonusForAveragePerformance() {
		forSalesOf(QUOTA).bonusIs(0);
	}
	@Test
	public void noBonusForEmptyTeam() {
		forSalesOf(QUOTA + 100).bonusIs(0);
	}
	@Test
	public void bonusAfterDivision()
	{
		forSalesOf(QUOTA+100).withTeamMember(4).bonusIs(2.5);
	}
	
	private SalesPersonTest withTeamMember(int teamMember) {
		this.teamMember = teamMember;
		// TODO Auto-generated method stub
		return this;
	}

	private void bonusIs(double d) {
		assertEquals(d,salesPerson.calculateBonus(sales,teamMember),PRECISION );		
	}
	private SalesPersonTest forSalesOf(double sales) {
		this.sales = sales;
		return this;
	}

}
