package in.mahajanDevelopers;

public class IfElse {

	public static void main(String[] args) {
		System.out.println("Understabnding ifelse conditional statements");

		String firstClientAmount = args[0];
		int firstPayment = Integer.parseInt(firstClientAmount);

		IfElse i = new IfElse();
		i.checkingSuccess(firstPayment);
	}

	public void checkingSuccess(int a) {
		if (a >= 1000 && a <= 5000) {
			System.out.println("It's really a good start");
		} else {
			System.out.println("You should struglle more to land your first freelance amount");
		}
	}

}
