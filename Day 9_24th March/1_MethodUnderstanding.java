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
//when int 
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

// when float
/* class MethodUnderstanding
{
	public static void main(String args[])
	{	
		String firstNum = args[0];
		String secNum = args[1];
		
		int numOne = Integer.parseInt(firstNum);
		int numTwo = Integer.parseInt(secNum);
		
		methodUnderstanding calc = new methodUnderstanding();
		int finalResult = calc.numberSum(numOne, numTwo);
		
		System.out.println("FInally Number sum can be give as - "+finalResult);
		
		String thirdNum = args[2];
		String fourthNum = args[3];
		
		float numThree = Float.parseFloat(thirdNum);
		float numFourth = Float.parseFloat(fourthNum);
		
		methodUnderstanding device = new methodUnderstanding();
		float anotherResult = device.numberDifference(numThree, numFourth);
		
		System.out.println("Hence, the floating Difference is - "+anotherResult);
	}
	
	public int numberSum(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	public float numberDifference(float d, float e)
	{
		float f = d-e;
		return f;
	}	
	
	
	
	
} */