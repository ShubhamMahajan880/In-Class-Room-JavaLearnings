
public class InternWorking {

	public static void main(String[] args) {
		String s1 = "Microsoft" + " Bangalore"; // SCP

		String s2 = "Adobe"; // SCP
		String s3 = " Gurugram"; // SCP

		String s4 = s2 + s3; // S4 .. ? Will in HEAP - Adobe Gurugram
		String s6 = "Adobe Gurugram"; // in SCP

		/*
		 * System.out.println(s4 == s6); // false - because s4 is in heap and s6 is
		 * literal which is in SCP.. memeory address not equal
		 * System.out.println(s4.equals(s6));// true
		 * System.out.println("-------------->");
		 *
		 * String s7 = new String("Adobe Gurugram"); System.out.println(s4 ==
		 * s7);//fals, becuase s7 createdin HEAP still having a cpy in SCP but addresses
		 * are different System.out.println(s4.equals(s7));//true
		 * System.out.println("-------------->");
		 */

		String s5 = s4.intern();// intern method is uses for creating a copy of HEAP object into SCP.
		System.out.println(s4 == s5);// true - becuase using intern one copy of that object in HEAP also created in SCP

		System.out.println(s4 == s6);
		System.out.println(s4.equals(s6));
		/*
		 * When we create an string like String s1 = new String("name") - then it
		 * created in HEAP as well as in SCP also ... but in somecases String only
		 * created in HEap like String s2 = "FatherName", now we want to make a copy of
		 * this only HEAP string into SCP - then we use the Intern Method() intern
		 * method is uses for creating a copy of HEAP object into SCP.
		 *
		 */

	}

}
