package Marker.Interface;

class WorkDetails implements WorkDoable{
	String companyName;
	String employeeDesignation;
	int salaryInfo;
	String jobRole;

	public WorkDetails(String companyName, String employeeDesignation, int salaryInfo, String jobRole) {
		super();
		this.companyName = companyName;
		this.employeeDesignation = employeeDesignation;
		this.salaryInfo = salaryInfo;
		this.jobRole = jobRole;
	}

}

class InformationRegardingWork {
	public void checkDetails(Object obj) {
		if (obj instanceof WorkDoable) {
			WorkDetails wD = (WorkDetails) obj;
			System.out.println("Name of the comoany is - " + wD.companyName);
			System.out.println("Designaiton of Employee is - " + wD.employeeDesignation);
			System.out.println("Salary Offering for this role to employee is - " + wD.salaryInfo);
			System.out.println("Job Role as per the Designaiton is - " + wD.jobRole);

		}
		else
		{
			System.err.println("Work is not Dobable and meaningful according to employee");
		}
	}
}

public class Driver {

	public static void main(String[] args) {
		System.out.println("WorkDetails.main()");
		WorkDetails wD2 = new WorkDetails("TCS", "System Cell", 25000, "System Administration Engineer");
		InformationRegardingWork iR = new InformationRegardingWork();
		iR.checkDetails(wD2);

	}

}
