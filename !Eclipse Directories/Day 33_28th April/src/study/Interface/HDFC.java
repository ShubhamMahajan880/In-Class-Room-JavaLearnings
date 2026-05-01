package study.Interface;

public class HDFC implements IBanking {

	@Override
	public void pay() {
		System.out.println("HDFC.pay()");

	}

	@Override
	public void settlePayment() {
		System.out.println("HDFC.settlePayment()");

	}

	@Override
	public void addCard() {
		System.out.println("HDFC.addCard()");

	}

	@Override
	public void modifyPayment() {
		System.out.println("HDFC.modifyPayment()");

	}

	public static void main(String[] args) {
		System.out.println("Understanding Interfae.. these all are child classes which must implement all funcitnalituires which is 100% abstract");
		HDFC hd = new HDFC();
		hd.pay();
		hd.settlePayment();
		hd.modifyPayment();
		hd.addCard();

	}
}
