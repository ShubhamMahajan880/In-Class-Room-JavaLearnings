class CarInfo
{
	//when using staic

		public static void main(String args[])
		{	
			
			int finalAmount = CarInfo.additionalExpense(10000, 300000);
			
			System.out.println("So, the final amount paid is - "+finalAmount);
		
		}
		
		static int additionalExpense(int insurance, int actualCost)
		{
			int overExpense = actualCost - insurance;
			return overExpense;
		}
}
//----------------------------

// understanding using static and without using static

/* class AdditionProgram
{	
	
	
	public static void main(String args[])
	{
		int result = AdditionProgram.additionClass(15,5);
		System.out.println("The sum is - "+result);
		
		AdditionProgram substractionResult = new AdditionProgram();
		int result2 = substractionResult.differenceClass(15,5);
		System.out.println("The Difference is - "+result2);		
	}
	//Usign static method to create method 
	static int additionClass(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	//without using static method
	int differenceClass(int d, int e)
	{
		int f = d-e;
		return f;
	}
	
} */

//------------------------------

// while doing by taking user input 

/* public static void main(String args[])
	{
		String first = args[0];
		String second = args[1];
		
		int firstNumber = Integer.parseInt(first);
		int secondNumber = Integer.parseInt(second);
		
		
		int finalAns = AdditionSystem.numberAddition(firstNumber, secondNumber);
		System.out.println("The sum is - "+finalAns);
		
	}
	
	static int numberAddition(int a, int b)
	{
		int c = a+b;
		return c;
	} */
	
	
	