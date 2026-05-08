package understanding.exception.hierarchy;

import java.util.Iterator;

public class Driver {
	public void doSomething()
	{
		String name = null; // assume : received from other class

		try {
			System.out.println(name.length()); // Risky Code
			System.out.println("After Length ....");
		} catch (Exception e) { // null pointer is child of Exception class. Exception class is responsibly parent class for all the other possible exceptions
			name = "NA";
			e.printStackTrace();
		}
		for(int i=0; i<5; i++)
		{
			System.out.println("Driver.doSomething()");
		}
	}

	public static void main(String[] args) {
		System.out.println("Driver.main()");
	}
}
