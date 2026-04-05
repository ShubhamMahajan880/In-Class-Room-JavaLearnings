package com.revision;

class SchoolAuthorities
{
	public SchoolAuthorities(String placeName) {
		super();
	}
}

class SchoolDetails extends SchoolAuthorities {
	String schoolName;
	String schoolAdress;
	int schoolFees;
	long schoolStudnets;
	String schoolBoard;

	public SchoolDetails(String _schoolName, String _schoolAdress, int _schoolFees, long _schoolSttudents) {
		this(_schoolName, _schoolAdress, _schoolFees, _schoolSttudents,"CBSE");
	}

	public SchoolDetails(String _schoolName, String _schoolAdress, int _schoolFees, long  _schoolStudnets, String _schoolBoard ) {
		super("Inside Khargone");
		this.schoolName = _schoolName;
		this.schoolAdress = _schoolAdress;
		this.schoolFees = _schoolFees;
		this.schoolStudnets = _schoolStudnets;
		this.schoolBoard = _schoolBoard;
	}
}

public class Revision1 {
	public static void main(String[] args) {
		System.out.println("Printing about School Details ");

		SchoolDetails sD = new SchoolDetails("SVM", "Tilakpath Khargone", 45000, 98989898);
		System.out.println("School name is  - "+sD.schoolName);
		System.out.println("Adress of School  is  - "+sD.schoolAdress );
		System.out.println("School's Fees is  - "+sD.schoolFees );
		System.out.println("School's students is  - "+sD.schoolStudnets );
		System.out.println("School Board is  - "+sD.schoolBoard );

	}
}
