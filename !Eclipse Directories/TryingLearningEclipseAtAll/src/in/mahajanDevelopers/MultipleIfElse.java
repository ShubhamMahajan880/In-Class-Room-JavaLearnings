package in.mahajanDevelopers;

public class MultipleIfElse {

	public static void main(String[] args) {
		System.out.println("Dealing with multiple if else statement here - ");

		System.out.println("Enter how much you earned - ");
		String freelanceSavings = args[0];
		int amountSaved = Integer.parseInt(freelanceSavings);
		System.out.println("So, you earned total - " + amountSaved + " till now");

		MultipleIfElse m = new MultipleIfElse();
		m.checkingFreedomEligibility(amountSaved);

	}

	public void checkingFreedomEligibility(int n1) {
		if (n1 >= 10000 && n1 <= 8000) {
			System.out.println("Many Congratulaitons .... you;ve achievment you've achieved Financial Freedom");
		} else if (n1 >= 5000 && n1 < 8000) {
			System.out.println("Good Going.. .Doing Great .. .close to succes.. .Paisa hi Paisa Hoga");
		} else if (n1 >= 2000 && n1 < 5000) {
			System.out.println("All the very best... you started earnings ..... Get a way ahead");
		} else
			System.out.println("Do Solid Hard Work ..at least 10 projects ina month to get a good amont every month");

	}

}
