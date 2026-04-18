
public class StringBuilderUnderstanding {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Shubham");
		sb.append(" Mahajan");
		System.out.println(sb); // Shubham Mahajan

		//If i had to do it like -

		String s1 = "Freelancing";
		System.out.println(s1);// Freelancing

		s1.concat("is a skill");
		System.out.println(s1);// Freelancing - no any changes in s1 becuase not assigned in s1. Just print twice s1 not concat.

		s1 = s1.concat("is a skill");
		System.out.println(s1);// Freelancingis a skill - by creating the same object again and usign assigning.. concatenated successfully.


		String s2 = "Developer";
		s2 = s2.concat(" Zone"); // in simple string for odify we can use concat .... and append can be only used in StringBuffer or StringBuilder
		System.out.println(s2); // Developer Zone
	}

}
