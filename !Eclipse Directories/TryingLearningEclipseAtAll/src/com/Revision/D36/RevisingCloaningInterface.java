package com.Revision.D36;

public class RevisingCloaningInterface implements Cloneable {

	String bookName;
	int bookPrice;
	double bookRatings;
	String bookPublication;

	public RevisingCloaningInterface(String _bookName, int _bookPrice, double _bookRatings, String _bookPublication) {
		System.out.println("RevisingCloaningInterface.RevisingCloaningInterface()");
		this.bookName = _bookName;
		this.bookPrice = _bookPrice;
		this.bookRatings = _bookRatings;
		this.bookPublication = _bookPublication;
	}

	@Override

	public RevisingCloaningInterface clone() throws CloneNotSupportedException {
		return (RevisingCloaningInterface) super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("RevisingCloaningInterface.main()");
		RevisingCloaningInterface rI = new RevisingCloaningInterface("Hanuman Chalisa", 40, 100.100,
				"Geetapress Gorakhpur");
		RevisingCloaningInterface rI2 = rI.clone();

		System.out.println("For rI - Book Details are as following - " + rI.bookName + " , " + rI.bookPrice + " , "
				+ rI.bookRatings + " , " + rI.bookPublication);
		System.out.println("For rI2 - Book Details are as following - " + rI2.bookName + " , " + rI2.bookPrice + " , "
				+ rI2.bookRatings + " , " + rI2.bookPublication);

		if (rI instanceof RevisingCloaningInterface) {
			System.out.println("Yes Cloneable object exist");
		} else {
			System.out.println("can't cloneable to this object type");
		}
	}

}
