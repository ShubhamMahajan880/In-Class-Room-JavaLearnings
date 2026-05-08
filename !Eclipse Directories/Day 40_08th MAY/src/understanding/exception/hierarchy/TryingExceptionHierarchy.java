package understanding.exception.hierarchy;

import java.util.Iterator;

public class TryingExceptionHierarchy {

public void performingOperations()
{
	String newName = null;

	try {
	System.out.println(newName.length());
	System.out.println("After Lenght ---");
	int i = 10/0;
	String a[] = {};
	String str = a[5];

	} catch (Exception e) { // Exception is universally parent of all other exceptions, so on taking it at first it'll include all other exceptions inside this
		newName ="NA";
		e.printStackTrace();
	}

	catch (NullPointerException e1) {
		// TODO: handle exception
	}

	catch (ArrayIndexOutOfBoundsException e2) {
		// TODO: handle exception
	}

	catch (ArithmeticException e) {
		// TODO: handle exception
	}

// No any other exception will work along with as Exception is universally used as parent exceptions, which is handling all exceptions by its own which will give the error.
// first handle the child exception then followed by parent and then followed  by Grand parents

	for(int i =0; i<5; i++)
	{
		System.out.println("TryingExceptionHierarchy.performingOperations()");
	}
}

	public static void main(String[] args) {
		System.out.println("TryingExceptionHierarchy.main()");

	}

}
