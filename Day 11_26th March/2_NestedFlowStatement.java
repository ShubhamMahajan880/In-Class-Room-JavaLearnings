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
		else
		{
			System.out.println("You passed the exam, All the very Best for the future, Be Hardworking");
		}
	}






}