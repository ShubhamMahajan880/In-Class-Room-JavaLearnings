class DiscountApplication
{

		public static void main(String args[])
		{
			String userValue = args[0];
			String userType = args[1];
			
			int itemValue = Integer.parseInt(userValue);
			
			
			System.out.println("Your Amount Costs is -  "+itemValue);
			System.out.println("Please mentiont the usertype -  "+userType);
			
			int minVal = 1000;
			
			if(itemValue>=minVal || userType.equals("GOLD"))
			{
				System.out.println("You can avail the beenfit, discount applied");
			}
			else
			{
				System.out.println("Not eliigible for avaialing the benefit of discount");
			}	
		
		}
		

/* 
E:\51 _Shagun\Java This Side\In Class Room\Day 8_23rd March>javac 3_UnderstandingOROperator.java

E:\51 _Shagun\Java This Side\In Class Room\Day 8_23rd March>java DiscountApplication 500 GOLD
Your Amount Costs is -  500
Please mentiont the usertype -  GOLD
You can avail the beenfit, discount applied

E:\51 _Shagun\Java This Side\In Class Room\Day 8_23rd March>java DiscountApplication 1000 SILVER
Your Amount Costs is -  1000
Please mentiont the usertype -  SILVER
You can avail the beenfit, discount applied

E:\51 _Shagun\Java This Side\In Class Room\Day 8_23rd March>java DiscountApplication 200 PLATINUM
Your Amount Costs is -  200
Please mentiont the usertype -  PLATINUM
Not eliigible for avaialing the benefit of discount

E:\51 _Shagun\Java This Side\In Class Room\Day 8_23rd March> */

}