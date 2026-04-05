package in.mahajanDevelopers;

class MobileDetails {

	String mobileName;
	String companyName;
	int mobilePrice;
	String operatingSystem;

	public MobileDetails() {
		System.out.println("Consturctd Default Method");
	}

	public MobileDetails(String _mobileName, String _companyName, int _mobilePrice, String _operatingSystem) {
		this.mobileName = _mobileName;
		this.companyName = _companyName;
		this.mobilePrice = _mobilePrice;
		this.operatingSystem = _operatingSystem;

	}

}

public class JavaRevision {

	public static void main(String[] args) {
		System.out.println("Learning Constructors ");

		MobileDetails mD1 = new MobileDetails();
		System.out.println("Default Constructor created and calling");

		MobileDetails mD2 = new MobileDetails("IQZ9SPRO", "IQ", 25000, "FuntouchOS");
		System.out.println("Printing mobile details 2");
		System.out.println("Name of the mobile is - "+ mD2.mobileName);
		System.out.println("mobile comoany is - "+mD2.companyName );
		System.out.println("mobuile price is - "+mD2.mobilePrice);
		System.out.println("OperatingSystem in mobile is - "+ mD2.operatingSystem );

	}

}
