package com.kodewala;
import java.lang.*; // Automaticllu inbuiltly uses inside  by compiler
import java.util.Scanner;

class Message
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please metion the name - ");
		
		String name = scanner.next();
		System.out.println("So, you entred - "+name);
		
		scanner.close();		
	}

}

//Scanner classs for all datatypes - 
/* public static void main(String args[])
		{
			Scanner scannerObj = new Scanner(System.in);
			System.out.println("what you wnat to print - ");
			
			String companyName = scannerObj.next();
			int CTC = scannerObj.nextInt();
			float compensation = scannerObj.nextFloat();
			double HRA = scannerObj.nextDouble(); 
			
			
			System.out.println("So, wanted to know about - "+companyName);
			System.out.println("So, about CTC - "+CTC);
			System.out.println("So, about compensation - "+compensation);
			System.out.println("So, about HRA- "+HRA); 
			scannerObj.close();
		}		
	}

//----------------
	
//All datatypes using scanner class 
/* E:\51 _Shagun\Java This Side\In Class Room\All Time Revision File>java ScannerUnderstanding
what you wnat to print -
microsoft 15 568.12 7899.65
So, wanted to know about - microsoft
So, about CTC - 15
So, about compensation - 568.12
So, about HRA- 7899.65 */
 */
 
 //----------------
 
 //One by one inputs from scanner class - 
 
 	/* public static void main(String args[])
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
	
O/P - 

E:\51 _Shagun\Java This Side\In Class Room\All Time Revision File>java ScannerUnderstanding
what you wnat to print -
microsft
So, wanted to know about - microsft
What's next wnat to know -
15
So, about CTC - 15
What's next wnat to know -
898.12
So, about compensation - 898.12
What's next wnat to know -
7899.325
So, about HRA- 7899.325	 */