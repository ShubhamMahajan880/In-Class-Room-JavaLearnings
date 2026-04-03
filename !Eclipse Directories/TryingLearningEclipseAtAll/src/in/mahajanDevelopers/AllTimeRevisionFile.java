package in.mahajanDevelopers;

class CompanyDetails {

	int salaryDetails;
	String companyName;
	String companyType;
	int CTC;
	String joiningLetter;
	String offerLetter;

	public CompanyDetails() {
		System.out.println("This is default constructor and nothing will orint over here - ");
	}

	public CompanyDetails(int _salaryDetails, String _companyName, String _companyType) {
		this.salaryDetails = _salaryDetails;
		this.companyName = _companyName;
		this.companyType = _companyType;
	}

	public CompanyDetails(int _salaryDetails, String _companyName, String _companyType, int _CTC, String _joiningLetter,
			String _offerLetter) {
		this.salaryDetails = _salaryDetails;
		this.companyName = _companyName;
		this.companyType = _companyType;
		this.CTC = _CTC;
		this.joiningLetter = _joiningLetter;
		this.offerLetter = _offerLetter;

	}

}

public class AllTimeRevisionFile {
	public static void main(String[] args) {
		System.out.println("Trying to learn about Constructors");

		CompanyDetails cD = new CompanyDetails();
		System.out.println("Default Message printing");

		CompanyDetails cD1 = new CompanyDetails(150000, "Micrsofot", "Hydrabad");
		System.out.println("Printing 1st Comoany Detail - ");
		System.out.println("Salary of cD1 is - " + cD1.salaryDetails);
		System.out.println("Company Name of cD1 is - " + cD1.companyName);
		System.out.println("Type of cD1 is - " + cD1.companyType);

		CompanyDetails cD2 = new CompanyDetails(20000, "Google", "Bangalore", 30, "YES", "YES");
		System.out.println("Printing 2nd Comoany Details as - ");
		System.out.println("Salary of cD2 is - " + cD2.salaryDetails);
		System.out.println("Company Name of cD2 is - " + cD2.companyName);
		System.out.println("Type of cD2 is - " + cD2.companyType);
		System.out.println("CTC of cD2 is - " + cD2.CTC);
		System.out.println("Joinig of cD2 is - " + cD2.joiningLetter);
		System.out.println("Offer of cD2 is - " + cD2.offerLetter);

		CompanyDetails cD3 = new CompanyDetails();
		System.out.println("Salary oif cD3 is - "+cD3.salaryDetails);



	}

}
