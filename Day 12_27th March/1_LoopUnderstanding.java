class LoopUnderstanding
{
	public static void main(String args[])
	{
		String number = args[0];
		int n = Integer.parseInt(number);
		
		System.out.println("Pleae enter the limits - "+number);
		
		for(int i=0; i<=n; i+=2)
		{
			System.out.println("So, current value is - "+i);
		}	
	}
}