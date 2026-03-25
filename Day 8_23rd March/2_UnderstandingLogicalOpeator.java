class VotingApplication
{

		public static void main(String args[])
		{
		 String userAge = args[0];
		 
		 int userIntAge = Integer.parseInt(userAge);
		 
		 int minAge = 18;
		 int maxAge = 100;
		 
		 System.out.println("Enter your age man - "+userAge);
		 
		 if(minAge<=userIntAge && userIntAge<=maxAge)
		 {
			System.out.println("You are eligible for VoterID, we are proceding forward");
			return;
		 }
		
		else
		 {
			System.out.println("Sorry, according to the age you are not consisdered for VoterId Card");
		 }	
		
		}
}