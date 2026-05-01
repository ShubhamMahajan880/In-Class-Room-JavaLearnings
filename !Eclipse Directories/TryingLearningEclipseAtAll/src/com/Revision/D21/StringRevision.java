package com.Revision.D21;


public class StringRevision {
	public static void main(String[] args) {
		String s1 = "Visa";
		String s2 = "visa";

		System.out.println(s1 == s2);// false - compares address of objects
		System.out.println(s1.equals(s2)); // false - compares values

		String s3 = "Visa";
		System.out.println(s1 == s3);//true  - obj already in scp,so same addresses
		System.out.println(s1.equals(s3)); // true - both havin same values.


		String s4 = new String("Visa");
		System.out.println(s1 == s4);//false  - in created in HEAP, but having a copy in SCP with different adddress
		System.out.println(s1.equals(s4));// true  - content is same.

		String s5 = new String("Visa");
		System.out.println(s4 == s5); // false - jb jb heap me nya object aayega ya new keyboard use kr k ibject bnega  . Hmesha differebt address pr bnega as a new object.. Heap never repeats
		System.out.println(s4.equals(s5));// true - content is still same here

		System.out.println("------------->");

		s1.concat("Bangalore");
		System.out.println(s1);// can;t do this concatenation as strings are immutable.

		String s6 = s1.concat("Bangalore");
		System.out.println(s1);
		System.out.println(s6);

		String s7 = "VisaBangalore";
		System.out.println(s7+"S7 waala");
		System.out.println(s6+"s6 wala");
		System.out.println(s6 == s7);// false -
		System.out.println(s6.equals(s7));//true - same content

		System.out.println("-------------->");

		String s8 = "technology";
		String s9 = "pursuing";
		String s10 = s8+s9;
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);

		String s11 = "technologypursuing";
		System.out.println(s11);
		System.out.println(s10 == s11); // false - becuase string created by adding 2 string creates new object which is in heap and s11 is scp, so not equality
		System.out.println(s10.equals(s11)); //content is same

		String s12 = "technology" + "pursuing";
		System.out.println(s12);
		System.out.println(s11 == s12);//true - only one ibject crated becfuase of compile time and its a literal and in scp.
		System.out.println(s11.equals(s12));//true - same content


		System.out.println(s10 == s12);//false - becuae s10 is created by string addition and its a new object whch is in heap whole s12 is literal and in SCP
		System.out.println(s10.equals(s12));//true - same content.

		System.out.println("------------------->");

		String s13 = "Walmart";
		String s14 = "Pune";

		String s15 = s13 + s14;
		System.out.println(s13);
		System.out.println(s14);
		System.out.println(s15);

		String s16 = "WalmartPune";
		System.out.println(s15 == s16);//false - because s15 is as a object and inside heap.
		System.out.println(s15.equals(s16));//true

		String s17 = s15.intern();
		System.out.println(s17 == s15);//false
		System.out.println(s17.equals(s15));//true.

		System.out.println(s17 == s16);//true - s17 giving the memory reference of s15 in scp ...
		System.out.println(s17.equals(s16));//true
	}


}
