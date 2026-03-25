class OperatorsUnderstanding
{

		public static void main(String args[])
		{
		
			String input = args[0];
			System.out.println("input in the string format "+input);
			int userAge = Integer.parseInt(input);// converting the string to int  (i.e "18") // local variable
			
			int minAge  = 18;
			System.out.println(minAge!=userAge);
			System.out.println(minAge == userAge);
			System.out.println(minAge>=userAge);
			System.out.println(minAge<=userAge);	
		
		}

/* input in the string format 25
true
false
false
true */


}