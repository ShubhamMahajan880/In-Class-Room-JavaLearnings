package com.Revision.D29;

class OwnerDetails
{
	public void propertyWork() {
		System.out.println("Owner.proeprtyWork()");

	}
}

class Worker extends OwnerDetails
{
	@Override
	public void propertyWork()
	{
		System.out.println("Worker.propertyWork()");
	}
}

public class RemovingMethodFromEitherOne {

	public static void main(String[] args) {
		System.out.println("RemovingMethodFromEitherOne.main()");

		OwnerDetails oD = new Worker();
		oD.propertyWork();//Worker.propertyWork() - depending on run time whch 0ne will be execure

		//On removing method from the child, will access the methid from parent class.
		oD.propertyWork();//Owner.proeprtyWork() - will execute from parent class as no method found in child class.

		//and on removing the method from the parent class, the Override concept won;t exist and then no polymorphism existing.

	}

}
