class NumberOperations
{
			public static void main(String args[])
			{
				String firstNumber = args[0];
				String secondNumber = args[1];				
				
				int firstInt = Integer.parseInt(firstNumber);
				int secondInt = Integer.parseInt(secondNumber);
				
				int additionResult  = firstInt + secondInt;
				int differenceResult = firstInt - secondInt;
				int multiplicationResult = firstInt * secondInt;
				int devisionResult = firstInt / secondInt;
				
					
				System.out.println("Addition is - "+additionResult);
				System.out.println("Difference is - "+differenceResult);
				
				System.out.println("Multiplication is - "+multiplicationResult);
				System.out.println("Devision Part is - "+devisionResult);
				
				
			}
	
	
	
}