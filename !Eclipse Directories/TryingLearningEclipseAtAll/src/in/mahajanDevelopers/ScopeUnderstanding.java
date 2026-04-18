package in.mahajanDevelopers;

public class ScopeUnderstanding {

	static String outsideMethodButInsideClassScope;

	public static void main(String[] args) {
		int dreamBalance = 11111;
		System.out.println("default value for static variable(class) string is - " + outsideMethodButInsideClassScope);

		System.out.println("value for crated instance varible(object) is " + dreamBalance);

		ScopeUnderstanding s = new ScopeUnderstanding();
		s.accountBalance();

	}

	public void accountBalance() {
		String balanceLooksLike = "1111$";
		System.out.println("Printing Local varibales value is -  " + balanceLooksLike);

	}

}
