class CarInfo
{
	// when not using static method 

	public static void main(String args[])
	{
	
		CarInfo billing = new CarInfo();// creting object of class CarInfo 
										//Calling (using it) method
		
		int finalAmount = billing.additionalExpense(10000, 300000);
		
		System.out.println("So, the final amount paid is - "+finalAmount);
	
	}
	
	int additionalExpense(int insurance, int actualCost)
	{
		int overExpense = actualCost - insurance;
		return overExpense;
	}
}

//----------------------------------------
/* class WorkingCalculator
{	
			
		public static void main(String args[])
		{
			
			WorkingCalculator a = new WorkingCalculator();
			int additionSum = a.additionMethod(10, 5);
			System.out.println("The Sum is - "+additionSum);	
			
			WorkingCalculator s = new WorkingCalculator();
			float substractionDifference = s.substractionMethod(15.5f,10.2f);
			System.out.println("Difference is - "+substractionDifference);
			
			WorkingCalculator m = new WorkingCalculator();
			double multiplicationProduct = m.multiplicationMethod(10.0,15.2);
			System.out.println("Multiplicaition result is - "+multiplicationProduct);
					
		}
		
		int additionMethod(int first, int second)
		{
			int sum = first+second;
			return sum;	
		}
		
		float substractionMethod(float third, float fourth)
		{	
			float difference = third - fourth;
			return difference;
			
		}
		
		double multiplicationMethod(double fifth, double sixth)
		{
			double product  = fifth * sixth;
			return product;
		}	
}

/* The Sum is - 15
Difference is - 5.3
Multiplicaition result is - 152.0 */ */


//---------------------------
// while doing by taking user input 

/* public static void main(String args[])
	{
		String first = args[0];
		String second = args[1];
		
		int firstNumber = Integer.parseInt(first);
		int secondNumber = Integer.parseInt(second);
		
		AdditionSystem a = new AdditionSystem();
		int finalAns = a.numberAddition(firstNumber, secondNumber);
		System.out.println("The sum is - "+finalAns);
		
	}
	
	int numberAddition(int a, int b)
	{
		int c = a+b;
		return c;
	} */