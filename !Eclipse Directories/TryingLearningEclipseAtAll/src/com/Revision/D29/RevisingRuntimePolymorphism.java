package com.Revision.D29;

class Owner
{
	public void propertyDetails()
	{
		System.out.println("Owner.propertyDetails()");
	}
}

class WorkersAndEmployee extends Owner
{
	@Override
	public void propertyDetails()
	{
		System.out.println("WorkersAndEmployee.propertyDetails()");
	}
}

public class RevisingRuntimePolymorphism {

	public static void main(String[] args) {
		System.out.println("RevisingRuntimePolymorphism.main()");
		Owner oR = new WorkersAndEmployee(); // Parent class -> child class - UpCasting
		oR.propertyDetails(); // kon sa method call hoga yh right side waale part pr depend krta h at runtime, so its - Runtime Polymorphism


		Owner oR2 = new Owner();//Parent -> Parent
		oR2.propertyDetails();

		WorkersAndEmployee wE = new WorkersAndEmployee(); // Child->Child
		wE.propertyDetails();

//		WorkersAndEmployee wE2 = (WorkersAndEmployee) new Owner(); // child->parent
//		wE2.propertyDetails();

//		Correct way to downcasting and accessing parent class also
		Owner oR3 = new WorkersAndEmployee();
		WorkersAndEmployee wE3 = (WorkersAndEmployee) oR3;
		wE3.propertyDetails();

	}

}
