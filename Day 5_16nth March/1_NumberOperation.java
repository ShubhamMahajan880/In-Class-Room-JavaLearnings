class NumberOperation
{

		public static void main(String args[])
		{	
		if(args.length != 2)
		{
			System.out.println("Please Provide Two Numbers");
			return;
		}
		String firstNumber = args[0];
		String secondNumber = args[1];
		int firstInt = Integer.parseInt(firstNumber);		;
		int secondInt = Integer.parseInt(secondNumber);
		
		int sum = firstInt + secondInt;
		
		System.out.println("Sum is - "+ sum);
			
		
		}


}