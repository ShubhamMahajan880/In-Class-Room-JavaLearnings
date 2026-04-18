package in.mahajanDevelopers;

public class MethodCall {

	public static void main(String[] args) {
		System.out.println("Trying to acessing another classes outside of main class");
		System.out.println("So, method call started --- >>");
		MethodCall m = new MethodCall();
		m.details();
		System.out.println("and similarly Method call ended ---->");

		System.out.println("Now calling to Calculations method");
		int result = m.calculations(15, 5);
		System.out.println(result);

		System.out.println("Calling to difference method ");
		int r2 = m.difference(15,5);
		System.out.println(r2);

		System.out.println("Calling to multiplication - ");
		double r3 = m.multiplication(15.4, 10.2);
		System.out.println(r3);

		String firstNumber = args[0];
		String secondNumber = args[1];

	}

	public void details() {
		System.out.println("these are some personal details apart from amin class");

	}

	public int calculations(int a, int b) {
		int c = a + b;
//		System.out.println("The sum of these 2 variables can give as - " + c);
		return c;
	}

	public int difference(int a, int b) {
		int d = a-b;
		return d;
	}

	public double multiplication(double d, double e2) {
		double e = d*e2;
		return e;

	}



}
