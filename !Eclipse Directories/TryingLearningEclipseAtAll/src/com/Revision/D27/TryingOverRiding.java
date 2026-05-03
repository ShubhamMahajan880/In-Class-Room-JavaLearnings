package com.Revision.D27;

class MacBook {
	void WindowsDifference() {
		System.out.println("MacBook.WindowsDifference()");
		System.out.println("In this PC Operating System is MAc");
	}

	public void costDifference()
	{
		System.out.println("MacBook.costDifference()");
		System.out.println("There is huge price difference in both the pc's");
	}
}

class Window extends MacBook {
	@Override
	protected void WindowsDifference() {
		System.out.println("Window.WindowsDifference()");
		System.out.println("Here Operating System is WIndows");
	}
}

public class TryingOverRiding {

	public static void main(String[] args) {
		System.out.println("TryingOverRiding.main()");
		System.out.println("Trying methods for Overriding");

		MacBook mB = new MacBook();
		mB.WindowsDifference();

		Window wD = new Window();
		wD.WindowsDifference();
		wD.costDifference();

	}

}
