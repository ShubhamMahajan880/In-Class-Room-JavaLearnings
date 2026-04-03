package com.kodewala;

class PlacedStudents {
	public PlacedStudents(String joiningBonus) {
		super();
	}
}

class PlacementInfo extends PlacedStudents {
	int costToCompany;
	String studentName;
	String companyName;
	int inHandSalary;
	String joiningstatus;

	public PlacementInfo(int _costToCompany , String _studentName, String _companyName, int _inHandSalary) {
		this(_costToCompany, _studentName, _companyName, _inHandSalary, "YES");

	}

	public PlacementInfo(int _costToCompany, String _studentNameString, String _companyName, int _inHandSalary,
			String _joiningStatus) {
		super("based on costToCompany");
		this.costToCompany = _costToCompany;
		this.studentName = _studentNameString;
		this.companyName = _companyName;
		this.inHandSalary = _inHandSalary;
		this.joiningstatus = _joiningStatus;
	}

}

public class Driver {

	public static void main(String[] args) {
		PlacementInfo studentInfo = new PlacementInfo(25, "Shubham Mahajan", "Microsoft", 1500000);
		System.out.println("Student Placement Info's are as following  - ");
		System.out.println(studentInfo.costToCompany);
		System.out.println(studentInfo.studentName);
		System.out.println(studentInfo.companyName);
		System.out.println(studentInfo.inHandSalary);
		System.out.println(studentInfo.joiningstatus);

	}

}
