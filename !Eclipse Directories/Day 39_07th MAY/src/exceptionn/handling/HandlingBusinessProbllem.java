package exceptionn.handling;

class Delivery {
	private String name;
	private String addLine1;
	private String addLine2;
	private String city;
	private String pinCodd;

	public Delivery(String name, String addLine1, String addLine2, String city, String pinCodd) {
		super();
		this.name = name;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.pinCodd = pinCodd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCodd() {
		return pinCodd;
	}

	public void setPinCodd(String pinCodd) {
		this.pinCodd = pinCodd;
	}

}

class Order {
	private String status;
	private String message;

	public Order(String status, String message) {
		super();
		this.status = status;
		this.status = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

public class HandlingBusinessProbllem {

	public static void main(String[] args) {
		Delivery del = new Delivery("AtishayJain", "1st Stage", "BTM Layout", null, null);
		Order order;

		try {
			del.getAddLine1();
			del.getAddLine2();

			String pinCode = del.getPinCodd();
			System.out.println(pinCode.codePointAt(0));// NPE
			order = new Order("OrderPlaced", "Send for Delivery");
		}

		catch (Exception e) {
			order = new Order("Hold", "Address is Incorrect");
		}
		System.out.println("status " + order.getStatus());

	}

}
