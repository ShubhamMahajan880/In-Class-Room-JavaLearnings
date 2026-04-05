package in.mahajanDevelopers;

class LibraryManagement {

	public LibraryManagement(String name)
	{
		this(1200);
		System.out.println("Book 2");
	}

	public LibraryManagement(int num) {
		super();
		System.out.println("Book 1");
	}
}

class Library extends LibraryManagement {

	public Library() {
		this(4500);
		System.out.println("Book 4");
	}

	public Library(int num) {
		super("Shubham");
		System.out.println("Book 3");

	}

}

public class Revision2 {
	public static void main(String[] args) {
		System.out.println("Understanding about Super class and this class in this class");

		Library lB = new Library();
		System.out.println("Book5 is here");

	}
}
