class HighNetWorthIndividuals
{
	public static void main(String args[])
	{	
		System.out.println("Please mention your total Property  - ");
		String netWorth = args[0];
		int totalProsperity = Integer.parseInt(netWorth);
		HighNetWorthIndividuals Hnwi = new HighNetWorthIndividuals();
		Hnwi.wealthCheck(totalProsperity);	
	}
	
	public void wealthCheck(int money)
	{
		if(money > 900000 && money < 1500000)
		{
			System.out.println("You comes under High Income Individuals  of India");
		}
		else
		{
			System.out.println("You do not comes under HIV's or HNWI's of India");
		}
	}









}
