class OrdrMgmt {
	OrdrMgmt(int amt) {
		super(); // calling object class constructor with one parameter
	}

	OrdrMgmt() {
		super(); // calling object class constructor - default super (with no args)
		System.out.println("Order(Management Wallah");
	}
}

class Order extends OrdrMgmt {
	public Order() {
		// constructor will always have either super(). or this().
		// super(); //call super class with No arguments
		// super(20); // calling super class with one arg. - available above level 25 of
		// Java.
		this("Kodwala");
		System.out.println("Order(Order wallah)");
	}

	public Order(String name) {
		super();
		System.out.println("Order(String Name waala)");
	}

}

public class SuperClassUnderstanding {
	public static void main(String[] args) {
		Order ord = new Order();// calling the constructor
	}
}

/*
 * Order(Management Wallah Order(String Name waala) Order(Order wallah)
 */
