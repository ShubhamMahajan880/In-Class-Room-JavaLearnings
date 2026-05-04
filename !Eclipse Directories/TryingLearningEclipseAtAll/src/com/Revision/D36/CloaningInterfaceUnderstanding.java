package com.Revision.D36;

public class CloaningInterfaceUnderstanding implements Cloneable { // must implement cloneable interface, so that can
																	// cloan actually

	String movieName;
	int amountCollection;
	double ratings;

	public CloaningInterfaceUnderstanding(String _movieName, int _amountCollection, double _ratings) {
		this.movieName = _movieName;
		this.amountCollection = _amountCollection;
		this.ratings = _ratings;

	}

	@Override
	public CloaningInterfaceUnderstanding clone() throws CloneNotSupportedException {
		return (CloaningInterfaceUnderstanding) super.clone(); // for cloning of object class
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("cloaningInterfaceUnderstanding.main()");
		CloaningInterfaceUnderstanding cI = new CloaningInterfaceUnderstanding("Kal Ho Na Ho", 852, 10.10);

		CloaningInterfaceUnderstanding cI2 = cI.clone();

		System.out.println("cI details - " + cI.movieName + " , " + cI.amountCollection + " , " + cI.ratings);
		System.out.println("cI2 details - " + cI2.movieName + " , " + cI2.amountCollection + " , " + cI2.ratings);

		// cloaningInterfaceUnderstanding.main()
		// cI details - Kal Ho Na Ho , 852 , 10.1
		// cI2 details - Kal Ho Na Ho , 852 , 10.1

	}

	// When doing without implementing cloneable -
	/*
	 * Exception in thread "main" cloaningInterfaceUnderstanding.main()
	 * java.lang.CloneNotSupportedException:
	 * com.Revision.D36.CloaningInterfaceUnderstanding at
	 * java.lang.Object.clone(Native Method) at
	 * com.Revision.D36.CloaningInterfaceUnderstanding.clone(
	 * CloaningInterfaceUnderstanding.java:19) at
	 * com.Revision.D36.CloaningInterfaceUnderstanding.main(
	 * CloaningInterfaceUnderstanding.java:26)
	 */

}
