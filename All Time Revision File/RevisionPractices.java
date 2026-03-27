import java.util.Scanner;
	class ScannerUnderstanding
	{
		public static void main(String args[])
		{
			Scanner scannerObj = new Scanner(System.in);
			System.out.println("what you wnat to print - ");
			
			String companyName = scannerObj.next();
			System.out.println("So, wanted to know about - "+companyName);
			
			System.out.println("What's next wnat to know - ");
			int CTC = scannerObj.nextInt();
			System.out.println("So, about CTC - "+CTC);
			
			System.out.println("What's next wnat to know - ");
			float compensation = scannerObj.nextFloat();
			System.out.println("So, about compensation - "+compensation);
			
			System.out.println("What's next wnat to know - ");
			double HRA = scannerObj.nextDouble(); 
			System.out.println("So, about HRA- "+HRA); 			
			
			scannerObj.close();
		}		
	}
	
//All datatypes using scanner class 
/* E:\51 _Shagun\Java This Side\In Class Room\All Time Revision File>java ScannerUnderstanding
what you wnat to print -
microsoft 15 568.12 7899.65
So, wanted to know about - microsoft
So, about CTC - 15
So, about compensation - 568.12
So, about HRA- 7899.65 */
