
class Employee {
	public static int employeeCount = 0;

	public int employeeID;
	public String employeeName;
	public String employeeCompany;

	{
		employeeCount += 1;
	}

	public Employee(String _employeeName, String _employeeCompany) {
		this.employeeName = _employeeName;
		this.employeeCompany = _employeeCompany;
		System.out.println("Employee Name - " + _employeeName + "," + "Employee Company  - " + _employeeCompany + ","
				+ employeeCount);

	}

}

public class EmployeeJoinigDetails {

	public static void main(String[] args) {
		System.out.println("Details of new joinees are - ");
		Employee e1 = new Employee("ShubhamMahajan", "Microsoft");
		Employee e2 = new Employee("NisargVaidhya", "Wells Fargo");
		Employee e3 = new Employee("LokeshDalal", "Paytm");
		Employee e4 = new Employee("SurajBishnoi", "JP Morgan Chase");
		Employee e5 = new Employee("AringamSharma", "VISA");
		Employee e6 = new Employee("ChaitanyaMarathi", "Nikee");

	}

}
