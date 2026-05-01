package com.Revision.D19;

class UnderstandingBlocking {
	{
		System.out.println("Instance Block 1 ");
	}
	{
		System.out.println("Instance Block 2");
	}

	public UnderstandingBlocking() {
		this(4.5);
		System.out.println("I am default constructor");
	}

	public UnderstandingBlocking(int amount) {
		super();
		System.out.println("I am constructor with parameters");
	}

	public UnderstandingBlocking(int price, String name) {
		System.out.println("I am constructor with 2 Parameter");
	}

	public UnderstandingBlocking(double pointValue) {
		System.out.println("I am this of default constructor");
	}

}

public class BlocksReviision {

	public static void main(String[] args) {
		System.out.println(" Main Method");

		UnderstandingBlocking uB = new UnderstandingBlocking();
		UnderstandingBlocking uB1 = new UnderstandingBlocking();
		UnderstandingBlocking uB2 = new UnderstandingBlocking(100);
		UnderstandingBlocking uB3 = new UnderstandingBlocking(500);
		UnderstandingBlocking uB4 = new UnderstandingBlocking(200, "Shubham");
		UnderstandingBlocking uB5 = new UnderstandingBlocking(400, "Manas");

	}

	static {
		System.out.println(" I am Static block");
	}

}
