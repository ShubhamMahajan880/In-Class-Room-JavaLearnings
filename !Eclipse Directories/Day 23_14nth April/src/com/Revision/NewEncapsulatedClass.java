package com.Revision;

public class NewEncapsulatedClass {

	public static void main(String[] args) {
		NewExampleGetSet nG = new NewExampleGetSet();
		//nG.carName = "BE6";
		System.out.println(nG.carName);

		nG.setCarName("Curv.EV");
		System.out.println(nG.getCarName());
	}

}
