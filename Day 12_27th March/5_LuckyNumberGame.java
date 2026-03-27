import java.util.Scanner;
class LuckyNumberGame
{
	public static void main(String args[])
	{
		int luckyNumber = 51;
		int enteredNumber = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the assuming number - ");
		
		while(luckyNumber != enteredNumber)
		{
			enteredNumber = sc.nextInt();
			
			if(luckyNumber == enteredNumber)
			{
				System.out.println("Congratulations, you won!!");
			}
			else
			{
				System.out.println("Sorry, Better luck next time");	
			}
		}
	}


}