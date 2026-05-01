package com.Revision;

abstract class BusBookingApplication {
	public abstract void offerPrices(); // High Level - What to announce? - abstract method

	public void FastuserInterface() {
		System.out.println("I am super of FastUserInterface");

	}

	public void FastUserInterface() { // // Normal Method - Non-Abstract Method
		System.out.println("If UI would be fast, it'd be good");
		System.out.println("Also, I am a default constructor of FastUserInterface");

	}
}

class RedBus extends BusBookingApplication {
	@Override
	public void offerPrices() {
		System.out.println("It's officially announced by govt.. we must have to follow"); // How - what to follow
																							// announce by High
																							// level(Abstract class
																							// Abstract Method in Parent
																							// class)
	}

	@Override
	public void FastuserInterface() // Normal Method - depends on the child they want to use it or not .. they want
									// to override or not.
	{
		System.out.println();

	}
}

class Paytm extends BusBookingApplication {
	@Override
	public void offerPrices() {
		System.out.println(
				"Wehn govt mandatory it for everyone then who we are to not follow, we are just child only we must will have to follow the guidelines and central rules");
	}
}

public class Driver {

	public static void main(String[] args) {
//		BusBookingApplication bbA = new BusBookingApplication(); // can;t create the object of Abstract class becuase class itself is INCOMPLETE
		RedBus rB = new RedBus();
		rB.offerPrices();

		Paytm pT = new Paytm();
		pT.offerPrices();

	}

}
