package com.Revision.D29;

class ParentClass {
	public void parentsInfo() {
		System.out.println("ParentClass.parentsInfo()");
	}
}

class ChildClass extends ParentClass {
	public void childInfo() {
		System.out.println("ChildClass.childInfo()");
	}
}

public class CastingConcepts {

	public static void main(String[] args) {
		System.out.println("CastingConcepts.main()");
		ParentClass pC = new ParentClass();
		pC.parentsInfo();
		ParentClass pC2 = new ChildClass(); // via parent class created object of child classs upcasting concept
		pC2.parentsInfo();


		ChildClass cC = new ChildClass();
		cC.parentsInfo();
		cC.childInfo();

		// ChildClass cC2 = (ChildClass) new ParentClass();
		// cC2.parentsInfo();
		// cC2.childInfo();

		ParentClass pC3 = new ChildClass();
		ChildClass cC3 = (ChildClass) pC3;
		cC3.parentsInfo();
		cC3.childInfo();

	}

}
