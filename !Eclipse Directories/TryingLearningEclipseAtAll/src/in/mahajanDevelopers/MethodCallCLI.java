package in.mahajanDevelopers;

public class MethodCallCLI {

	public static void main(String[] args) {
		System.out.println("Starting from here----> ");

		System.out.println("First Method call start - >");
		MethodCallCLI m = new MethodCallCLI();
		m.justCheckTheFlow();

		System.out.println("Flow Completed -->1");

		CallingtoStaticMethod c1 = new CallingtoStaticMethod();
		//c1.methodCallChecking(); - Can't call because ths declared private in the actual class(CallingtoStaticMethod) allthough within the same package but in that class it mentioned as private

		System.out.println("Enter your fav numbers here - ");
		String num1 = args[0];
		String num2 = args[1];

		int firstNumber = Integer.parseInt(num1);
		int secondNumber = Integer.parseInt(num2);

		System.out.println("so, user entered - "+firstNumber+" & "+secondNumber+" respectively ");

		System.out.println("User input taken successfuly ---now calling to calculator for operations performance");
		MethodCallCLI c = new MethodCallCLI();
		c.calculator(firstNumber, secondNumber);

	}

	public void justCheckTheFlow() {
		System.out.println("Checking flow as a first methid created");

	}

	public void calculator(int a, int b) {
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		int g = a % b;

		System.out.println("So, the addition of both number is - " + c);
		System.out.println("So, the Differene of both number is - " + d);
		System.out.println("So, the Multipliation of both number is - " + e);
		System.out.println("So, the Devision of both number is - " + f);
		System.out.println("So, the Modulus of both number is - " + g);

	}

}
