
class Employee {
	public void extraBonuses(int salary) {
		System.out.println("Salary of the employee is - " + salary);
	}

	public void extraBonuses(int salary, String bonus) {
		System.out.println("Salary of the employee is - " + salary);
		System.out.println("Bonus employee have  - " + bonus);

	}

	public void extraBonuses(int salary, String bonus, String incentives) {
		System.out.println("Salary of the employee is - " + salary);
		System.out.println("Bonus employee have  - " + bonus);
		System.out.println("Incentives given to the employee is - " + incentives);
	}

	public void extraBonuses(int salary, String bonus, String incentives, String hikeGiven) {
		System.out.println("Salary of the employee is - " + salary);
		System.out.println("Bonus employee have  - " + bonus);
		System.out.println("Incentives given to the employee is - " + incentives);
		System.out.println("Recent Hike given to employee is - " + hikeGiven);
	}

}

public class EmplyeePerks {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.extraBonuses(111111, "Joining Bonus", "House Rent Allowance & Free Food", "150 % Increment");
		e1.extraBonuses(500000, "Joining Bonus");


	}

}
