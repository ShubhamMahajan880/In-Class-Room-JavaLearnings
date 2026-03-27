class DefaultLoopUnderstanding
{
	public static void main(String args[])
	{
		String goldenWords = args[0];
		System.out.println("Please mention the statement - ");
		
		for(int index = 0; index<args.length; index++)
		{
			System.out.println(args[index]);
		}		
	}
}