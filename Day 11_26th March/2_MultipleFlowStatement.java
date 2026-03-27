class ResultMethodology
{	
	public static void main(String args[])
	{
	System.out.println("Please Enter your marks - ");
	String marks = args[0];
	int gradings = Integer.parseInt(marks);
	ResultMethodology finalGrades = new ResultMethodology();
	finalGrades.calculateGrades(gradings);
		
	}
	
	
	public void calculateGrades(int percentage)
	{
		if(percentage >= 85)
		{
			System.out.println("Congratulations, you are in Exceelence and First Division in the batch");
		}
		else if(percentage >= 70 && percentage < 85)
		{
			System.out.println("You've done wonderfully, you are in the Second Division");
		}
		else if(percentage >= 55 && percentage < 70)
		{
			System.out.println("You've done wonderfully, you are in the Thoird Division");
		
		}
		else if(percentage >= 40 && percentage < 55)
		{
			System.out.println("You've done wonderfully, you are in the Thoird Division");
		}
		else
		{
			System.out.println("You passed the exam, All the very Best for the future, Be Hardworking");
		}
	}
}

// by creating the static method and accessing from the class in main method - 

/* class UnderstandingControlFlow
{
	
	public static void main(String args[])
	{	
		String packageCracked = args[0];
		System.out.println("Please enter the annual CTC - ");
		int totalCompensation = Integer.parseInt(packageCracked);
		
		UnderstandingControlFlow valAdded = new UnderstandingControlFlow();
		valAdded.betterFlow(totalCompensation);
	}
	
	void betterFlow(int CTC)
	{
		
		if(CTC>=25)
		{
			System.out.println("Outstanding youi are on riught track ... now enjoy the life well.");
		}
		
		else if(CTC>=20 && CTC<25)
		{
			System.out.println("Please be a little bit more hardworking");
		}
		else if(CTC>= 15 && CTC < 20)
		{
			System.out.println("YOu can do much better ... Keep Going");
		}
		else if(CTC>=12 && CTC <15)
		{
			System.out.println("We have more higher expectations from you");
		}
		else
		{
			System.out.println("YOu have to do a lot Hardwork .. 12 Lakhs is very low in bengaluru men");
		}
			
	}
} */