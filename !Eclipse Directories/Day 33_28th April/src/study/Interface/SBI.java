package study.Interface;

public class SBI implements IBanking {
	@Override
	public void pay() {
		System.out.println("SBI.pay()");
	}

	@Override
	public void settlePayment() {
		System.out.println("SBI.settlePayment()");

	}

	@Override
	public void addCard() {
		System.out.println("SBI.addCard()");

	}

	@Override
	public void modifyPayment() {
		System.out.println("SBI.modifyPayment()");

	}

	public static void main(String[] args) {
		SBI sb  = new SBI();
		sb.pay();
		sb.settlePayment();
		sb.addCard();
		sb.modifyPayment();
	}

}
