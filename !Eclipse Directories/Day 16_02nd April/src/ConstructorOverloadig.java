class PlacementCourse {
	int feeStructure;
	String courseName;
	String courseExpectations;
	String coursePurpose;
	int additionalFee;

	public PlacementCourse(int _feeStructure, String _courseName) {
		this.feeStructure = _feeStructure;
		this.courseName = _courseName;
	}

	public PlacementCourse(int _feeStructure, String _courseName, String _courseExpectations) {
		this.feeStructure = _feeStructure;
		this.courseName = _courseName;
		this.courseExpectations = _courseExpectations;
	}

	public PlacementCourse(int _feeStructure, String _courseName, int _additionalFee, String _coursePurpose) {
		this.feeStructure = _feeStructure;
		this.courseName = _courseName;
		this.additionalFee = _additionalFee;
		this.coursePurpose = _coursePurpose;
	}

}

public class ConstructorOverloadig {

	public static void main(String[] args) {
		System.out.println("Printing All Courses Info - "); // passing arguments

		PlacementCourse course1 = new PlacementCourse(150000, "JavaFullStack");
		System.out.println("Course1 Details are following - ");
		System.out.println("Course1 Fees is - " + course1.feeStructure);
		System.out.println("Course1 Name is - " + course1.courseName);

		PlacementCourse course2 = new PlacementCourse(200000, "JavaBackEnd", "PlacementSepcific");
		System.out.println("Course2 Details are following - ");
		System.out.println("Course2 Fees is - " + course2.feeStructure);
		System.out.println("Course2 Name is - " + course2.courseName);
		System.out.println("Course2 Expectations are - " + course2.courseExpectations);

		PlacementCourse course3 = new PlacementCourse(30000000, "MERN Stack Deveelopemnt", 1500000,
				"IntercviewPreparaitions");
		System.out.println("Course3 Details are following - ");
		System.out.println("Course3 Fees is - " + course3.additionalFee);
		System.out.println("Course3 Name is - " + course3.courseName);
		System.out.println("Course3 Additional Feees is - " + course3.additionalFee);
		System.out.println("Course3 Purpsuie  is- " + course3.coursePurpose);

	}

}
