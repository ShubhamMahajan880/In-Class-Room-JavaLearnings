package in.mahajanDevelopers;

class OrderMgmt // default extends from super class
{

	public OrderMgmt() {
		super();
		System.out.println("The Default call for Super class ");
	}
}

class Order extends OrderMgmt {
	public Order() {
		this(450);
		System.out.println("The name is - ");
	}

	public Order(int number) {
		super();
		System.out.println("The number is - " + number);
	}
}

public class Driver {
	public static void main(String[] args) {
		System.out.println("Leanring about super class and concepts ");

		Order od = new Order();

	}

}
