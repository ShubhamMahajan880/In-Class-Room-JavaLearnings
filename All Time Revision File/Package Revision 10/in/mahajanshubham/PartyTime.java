package in.mahajanshubham;
import in.shubhammahajan.LearningJava;

	class PartyTime
	{
		public void insideDetails()
		{
			LearningJava info = new LearningJava();

			System.out.println(info.feesTotal);
		 
		}
		
		public static void main(String args[])
		{
			
		}
	}
	
	
// final output while learning Package and import 


/* E:\51 _Shagun\Java This Side\In Class Room\All Time Revision File\Package Revision 10>javac in/shubhammahajan/LearningJava.java

E:\51 _Shagun\Java This Side\In Class Room\All Time Revision File\Package Revision 10>java  in/shubhammahajan/LearningJava

E:\51 _Shagun\Java This Side\In Class Room\All Time Revision File\Package Revision 10>javac  in/shubhammahajan/PlacementPart.java

E:\51 _Shagun\Java This Side\In Class Room\All Time Revision File\Package Revision 10>java  in/shubhammahajan/PlacementPart

E:\51 _Shagun\Java This Side\In Class Room\All Time Revision File\Package Revision 10>javac in/mahajanshubham/PartyTime.java
in\mahajanshubham\PartyTime.java:10: error: feesTotal is not public in LearningJava; cannot be accessed from outside package
                        System.out.println(info.feesTotal);
                                               ^
1 error */