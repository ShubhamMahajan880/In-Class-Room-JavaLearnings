package com.Revision;

class Revision {
	{
		System.out.println("Init Calling after Object creation");
	}
	{
		System.out.println("Calling to 2nd Init Block");
	}
	{
		System.out.println("Let's see when 3rd Init will execute and start");
	}

	public Revision() {
		System.out.println("After Init we'll call to constrctors message");
	}

	public Revision(int number) {
		System.out.println("After first constrctors 2nd will be called");
	}

}

public class R1Blocks {

	public static void main(String[] args) {
		System.out.println("After this cursor comes to main method and call main method");

		Revision r1 = new Revision();
		Revision r2 = new Revision();
	}

	static {
		System.out.println("first static will be called... doesn;t matter");
	}

}
