
public class StringObjUnderstanding {

	public static void main(String[] args) {
		String s1 = "Microsoft";
		String s2 = "Microsoft";

		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));// true

		String s3 = "microsoft";
		System.out.println(s1 == s3);// false
		System.out.println(s1.equals(s3));// false

		String s5 = new String("microsoft");
		System.out.println(s1 == s5);//// false
		System.out.println(s1.equals(s5));//// false

		System.out.println(s3 == s5);// false - bhle hi using new ek copy SCP me bni ho leking HEAP waala to new hi hena to uska address not equal to SCP waale ka address
		System.err.println(s3.equals(s5));//true

		String s55 = new String("microsoft");
		System.out.println(s5 == s55);// false - jb jb new keyword use hoga HEAP me nya object bnega .. bhle hi same object value ho.
		System.out.println(s5.equals(s55));// true

		System.out.println("-------------------------->");

		s1.concat("Hyderabad");
		System.out.println(s1);// can't do it, because string is Immutable.
		String s4 = s1.concat("Bangalore"); // S4 - In heap and content is -MicrosoftBangalore
		System.out.println(s4);//MicrosoftBangalore

		String s7 = "MicrosoftBangalore"; // S7 - In SCP and content is - MicrosoftBangalore
		System.out.println(s4 == s7);// false

		String s6 = s1.concat("Bangalore");
		System.out.println(s4);// MicrosoftBangalore

		System.out.println(s4 == s6);// false
		System.out.println(s4.equals(s6));// true - on cancatinsting same via 2 different object it creates in Heap.
		// Concat --> Heap

		System.out.println("-------------------------->");

		String s10 = "Bangalore";
		String s11 = "India";
		String s12 = s10 + s11;
		System.out.println(s12); // BangaloreIndia - s12 will be created in heap

		String s13 = "BangaloreIndia";
		System.out.println(s12 == s13);// false because s13 is litteral and in SCP, while s12 is in Heap and as a
		// object

		String s14 = "Bangalore" + "India"; // compile Time Optimization , only single object will be created which is
		// Liternal and in SCP.
		// If we add 2 different strings by creating a 3rd string then that 3rd string
		// will be as an object and in HEAP, but when we add all strings using ""+"" by
		// creating a new String the its not objects, its a literal and in SCP.

		System.out.println(s12 == s14);// false
	}

}
