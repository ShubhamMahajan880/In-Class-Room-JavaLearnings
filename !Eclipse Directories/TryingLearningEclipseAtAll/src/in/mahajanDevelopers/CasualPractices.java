package in.mahajanDevelopers;

class InfluencerDetails {
	public InfluencerDetails() {
		System.out.println("Printing Default Arguement");
	}

	String influencerName;
	String influencerMotive;
	int influencerBankBalance;
	String influencerPlace;
	String influencerWife;
	String influencerProgram;
	int influencerRevenue;

	public InfluencerDetails(String influencerName, String influencerMotive, int influencerBankBalance) {
		this(influencerName, influencerMotive, influencerBankBalance, "Ahmedabad");

	}

	public InfluencerDetails(String influencerName, String influencerMotive, int influencerBankBalance,
			String influencerPlace) {
		this.influencerName = influencerName;
		this.influencerMotive = influencerMotive;
		this.influencerBankBalance = influencerBankBalance;
		this.influencerPlace = influencerPlace;
	}

	public InfluencerDetails(String influencerName, String influencerMotive, int influencerBankBalance,
			String influencerPlace, String influencerWife) {
		this(influencerName, influencerMotive, influencerBankBalance, influencerPlace, influencerWife,
				"PushkarRetreatCenter", 15000000);

	}

	public InfluencerDetails(String influencerName, String influencerMotive, int influencerBankBalance,
			String influencerPlace, String influencerWife, String influencerProgram, int influencerRevenue) {
		this.influencerName = influencerName;
		this.influencerMotive = influencerMotive;
		this.influencerBankBalance = influencerBankBalance;
		this.influencerPlace = influencerPlace;
		this.influencerWife = influencerWife;
		this.influencerProgram = influencerProgram;
		this.influencerRevenue = influencerRevenue;
	}

}

public class CasualPractices {

	public static void main(String[] args) {
		System.out.println("Working with Default Argument ");
		InfluencerDetails iD = new InfluencerDetails();
		System.out.println("Now moving forward");

		InfluencerDetails iD1 = new InfluencerDetails("SnehDesai", "MotivationalSpeaker", 1000000000);
		System.out.println("Details for influecne 1 are - ");

		System.out.println("Name of the influecner is - " + iD1.influencerName);
		System.out.println("Motive of the influecner is - " + iD1.influencerMotive);
		System.out.println("BankBalcen of the influecner is - " + iD1.influencerBankBalance);
		System.out.println("Place of the influecner is - " + iD1.influencerPlace+"\n");

		InfluencerDetails iD2 = new InfluencerDetails("BSR", "SpiritualCoach", 50000, "Pune , Maharashtra",
				"ShaliniDevi");
		System.out.println("Details for influecner 2  are - ");

		System.out.println("Name of the influecner 2 is - " + iD2.influencerName);
		System.out.println("Motive of the influecner 2 is - " + iD2.influencerMotive);
		System.out.println("BankBalcen of the influecner 2 is - " + iD2.influencerBankBalance);
		System.out.println("Place of the influecner 2 is - " + iD2.influencerPlace);
		System.out.println("Wife of the influecner 2 is - " + iD2.influencerWife);
		System.out.println("program of the influecner 2 is - " + iD2.influencerProgram);
		System.out.println("Total Revenue of the influecner 2 is - " + iD2.influencerRevenue);

	}

}
