package Interface.in.mahajanDevelopers;

interface IBankingSystem {
	void bankIncentives();

	void bankPolicies(); // public abstract void bankPolicies()

	default void bankTransactions() {
		System.out.println("IBankingSystem.bankTransactions() - Default waala Transaction call");
	}

	public static void bankBonuses() {
		System.out.println("IBankingSystem.bankBonuses()");
		IBankingSystem.bankReciept();
		IBankingSystem.bankLogo();
	}

	public static void bankInterests() {
		System.out.println("IBankingSystem.bankInterests()");
		IBankingSystem.bankReciept();
		IBankingSystem.bankLogo();
	}

	private static void bankReciept()
	{
		System.out.println("IBankingSystem.bankReciept()"); // Java  - 1.9 version1 - Private internal methods for other static methods
	}

	private static void bankLogo()
	{
		System.out.println("IBankingSystem.bankLogo()"); // Java  - 1.9 version1 - Private internal methods for other static methods
	}

}

class BOB implements IBankingSystem {
	@Override
	public void bankIncentives() {
		System.out.println("BOB.bankIncentives()");
	}

	@Override
	public void bankPolicies() {
		System.out.println("BOB.bankPolicies()");
	}

	@Override
	public void bankTransactions() {
		System.out.println("BOB.bankTransactions()");
		IBankingSystem.bankBonuses();
	}
}

class SBI implements IBankingSystem {
	@Override
	public void bankIncentives() {
		System.out.println("SBI.bankIncentives()");
		IBankingSystem.bankBonuses();
	}

	@Override
	public void bankPolicies() {
		System.out.println("SBI.bankPolicies()");
		IBankingSystem.bankInterests();
	}

}

public class FixingInterfaceV8Issues {

	public static void main(String[] args) {
		System.out.println("FixingInterfaceV8Issues.main()");
		BOB bO = new BOB();
		bO.bankIncentives();
		bO.bankPolicies();
		bO.bankTransactions();
		System.out.println("-------------->");

		SBI sB = new SBI();
		sB.bankIncentives();
		sB.bankPolicies();
		sB.bankTransactions();

	}

}
