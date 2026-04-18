package in.mahajanDevelopers;

public class NumberAddition {



	public static void main(String[] args) {
		String num1 = args[0];
		String num2 = args[1];


		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);

		int n3 = n1 + n2;
		System.out.println("Number sum is given as  - "+n3);


	}

}
