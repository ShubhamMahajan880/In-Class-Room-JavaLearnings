class OperatorsUnderstanding
{
	
		public static void main(String args[])
		{
			String voteAge = args[0];
			String priceValue = args[1];
			String userType = args[2];
			
			int userAge = Integer.parseInt(voteAge);
			int userValue = Integer.parseInt(priceValue);
			
			int minAge = 18;
			int maxAge = 65;
			int minPrice = 1000;
			
			
			
			System.out.println("Enter the Age of Person - "+userAge);
			if(userAge>=minAge)
			{
				System.out.println("YOu can vote");
				
			}
			else
			{
				System.out.println("Not Eligible Man");
			}
			
			if(userAge>=minAge && userAge<=maxAge)
			{
				System.out.println("let's vote man, you are in the age group");
			}
			else
			{
					System.out.println("Age Group is Not Valid, Please ensure the correct age");
			}
			
			
			if(userValue>=minPrice || userType.equals("GOLD"))
			{
				System.out.println("Valid, Coupon tag applicable on "+userValue+ "and"+ userType);
			}
			
			else
			{
				System.out.println("Not valid for "+userValue +"and"+ userType);
			}	
			
		}
}


/* E:\51 _Shagun\Java This Side\In Class Room\Day 8_23rd March>RevisionSummary.java

E:\51 _Shagun\Java This Side\In Class Room\Day 8_23rd March>java OperatorsUnderstanding  45 500 SILVER
Enter the Age of Person - 45
YOu can vote
let's vote man, you are in the age group
Not valid for 500andSILVER

E:\51 _Shagun\Java This Side\In Class Room\Day 8_23rd March>java OperatorsUnderstanding  17 1000 SILVER
Enter the Age of Person - 17
Not Eligible Man
Age Group is Not Valid, Please ensure the correct age
Valid, Coupon tag applicable on 1000andSILVER

E:\51 _Shagun\Java This Side\In Class Room\Day 8_23rd March>java OperatorsUnderstanding  56 500 GOLD
Enter the Age of Person - 56
YOu can vote
let's vote man, you are in the age group
Valid, Coupon tag applicable on 500andGOLD
 */