class Payment
{

		static int balance; // Declaraiton of Variable
		static int minimumBalance; 		
		static String bankName = "SBI";
		
		
		public static void main(String args[])
		{
				
			
			String accountHolderName = "Shubham Mahajan";
			balance = 1200; 
			balance  = balance + 100;
			minimumBalance = 500;
			
			System.out.println("The Account having Balance is - "+balance); // using the variable
			System.out.println("You must have minimum Balance is - "+minimumBalance); 
			System.out.println("Accout on the name of  - "+accountHolderName); 
			System.out.println("Bank Name is   - "+bankName); 
		
		}


}