package test;

public class SalespPerson {

	private double quota;
	private double commisionPercentage;

	public SalespPerson(final double quota, double commisionPercentage) {
		this.quota = quota;
		this.commisionPercentage = commisionPercentage;
	}

	public double calculateBonus( final double sales, int teamMember) {
		final double commisionableBonus = Math.max(sales-quota,0);
		final double amountBeforeDivision = commisionableBonus*commisionPercentage/100;
		return divideBonus(amountBeforeDivision,teamMember);
	}

	private double divideBonus(double amount, int teamMember) {
		// TODO Auto-generated method stub
		if(teamMember==0)
			return 0;
		return amount/teamMember;
	}

}
