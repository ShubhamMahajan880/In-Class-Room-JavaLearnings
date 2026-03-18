class DataTypeLearning
{
		static byte dateByte = 125; 
		static byte checkByte;
		
		static short dataShort = 4555;
		static short checkShort;
		
		static int dataInt = 15000;
		static int checkInt;
		
		static long dataLong = 888888;
		static long checkLong;
		
		static float dataFloat = 7.55f;
		static float checkFloat;
		
		static double dataDouble = 3.1416789542;
		static double checkDouble;
			
		static char dataChar = 'A';
		static char checkChar;
		
		static String dataString = "I am a hardworking boy";
		static String checkString;
		
		static boolean dataBoolean = false;
		static boolean checkBoolean;
		
		public static void main(String args[])
		{
			System.out.println("So, Byte Dta is "+ dateByte);
			System.out.println("So, Short Dta is "+ dataShort);
			System.out.println("So, int Dta is "+ dataInt);
			System.out.println("So, long Dta is "+ dataLong);
			System.out.println("So, float Dta is "+ dataFloat);
			System.out.println("So, double Dta is "+ dataDouble);
			System.out.println("So, char Dta is "+ dataChar);
			System.out.println("So, String Dta is "+ dataString);
			System.out.println("So, Boolena Dta is "+ dataBoolean);
			
			System.out.println("Checling all datatypes's sizes as  - ");
			System.out.println("Size of Default Byte Data is - "+ checkByte);
			System.out.println("Size of Default Short Data is - "+ checkShort);
			System.out.println("Size of Defaut Int Data is - "+ checkInt);
			System.out.println("Size of Default Long Data is - "+ checkLong);
			System.out.println("Size of Default Float Data is - "+ checkFloat);
			System.out.println("Size of Default Double Data is - "+ checkDouble); 
			System.out.println("Size of Default Char Data is - "+ checkChar); 
			System.out.println("Size of Default String Data is - "+ checkString);			
			System.out.println("Size of Default Boolean Data is - "+ checkBoolean);
		}
	
/* So, Byte Dta is 125
So, Short Dta is 4555
So, int Dta is 15000
So, long Dta is 888888
So, float Dta is 7.55
So, double Dta is 3.1416789542
So, char Dta is A
So, String Dta is I am a hardworking boy
So, Boolena Dta is false
Checling all datatypes's sizes as  -
Size of Default Byte Data is - 0
Size of Default Short Data is - 0
Size of Defaut Int Data is - 0
Size of Default Long Data is - 0
Size of Default Float Data is - 0.0
Size of Default Double Data is - 0.0
Size of Default Char Data is -
Size of Default String Data is - null
Size of Default Boolean Data is - false */
	
}