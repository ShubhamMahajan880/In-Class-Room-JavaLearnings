package in.mahajanDevelopers;

class LaptopInvention {
	public LaptopInvention(String activityPerformance) {
		super();
		System.out.println("Calling Object 2");
	}

	public LaptopInvention() {
		this("Manifestation");
		System.out.println("Calling Object 3");
	}
}

class LaptopManagementSystem extends LaptopInvention {
	public LaptopManagementSystem() {
		this(1111);
		System.out.println("Calling Object 5");
	}

	public LaptopManagementSystem(int angelNumber) {
		super();
		System.out.println("Calling Object 4");
	}
}

class Laptop extends LaptopManagementSystem {
	public Laptop() {
		this("Laptop Using");
		System.out.println("Calling Object 7 ");
	}

	public Laptop(String work) {
		super();
		System.out.println("Calling Object 6");
	}

}

public class LearningClasses {
	public static void main(String args[]) {
		System.out.println("Reading about this and super class");
		System.out.println("Calling Obejct 1");
		Laptop lP = new Laptop();
		System.out.println("Calling Object 8");
		System.out.println("Calling done for 1st object(lP1)");

		System.out.println(", lets do it for object  2(lP2)");
		Laptop lP2 = new Laptop();
		System.out.println("Another Calling Obejct 1");
		System.out.println("Succdessfully executed for 2nd Object lp2 also ");
		System.out.println("Program terminated successfully");

	}

}
