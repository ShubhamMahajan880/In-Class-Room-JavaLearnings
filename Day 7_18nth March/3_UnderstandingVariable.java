class UnderstandingVaribale
{
	static int amount = 1000; // Primitve var(common minbalance amount for all)
	static String name; // Non-primitve 
	
	public static void main(String args[])
	{
		int newAmount = 12; // local variable
		
		System.out.println("newAmount is "+newAmount);
		System.out.println("By default checking for Non-Parameter DataType is - "+ name);
	}
	
	public void printInfo()
	{
		int newAmount = 1200;
		String city = "Bangalore";// local variable
	}


}