
class Delivery {
	public void doDeliver() {
		System.out.println("Delivery.doDeliver()");

	}
}

class EComDelivery extends Delivery {
	@Override
	public void doDeliver() {
		System.out.println("EComDelivery.doDelivery()");

	}
}

public class RuntimePolymorphism {
	public static void main(String[] args) {
		Delivery del = new EComDelivery(); // parent class can refer child class object (Auto Up Casting)
		del.doDeliver();// EComDelivery.doDelivery() - Compile type it check + it call based on actual
						// object.

	}

	/*
	 * in Delivery del = new EComDelivery(); Delivery del = phle compile time pr
	 * yaha check hoga ... it will be on the base of Delivery class then new
	 * EComDelivery() - at time of runtime yaha check hoga. EComDelivery me - now
	 * here can be anything - child or class whatever whoose object create will
	 * check always on run time
	 *
	 */

}
