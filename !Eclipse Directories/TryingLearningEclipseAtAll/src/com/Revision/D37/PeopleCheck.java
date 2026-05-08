package com.Revision.D37;

//Trying without using upcasting and creating simple object

class JudgingPeople implements Trustable{
	String maleFriendD;
	String femaleFriend;
	int noOfMaleFriends;
	int noOfFemaleFriends;
	double overalTrustingPeople;

	public JudgingPeople(String _mF, String fF, int _noOfmF, int _noOffF, double _trustResult)

	{
		this.maleFriendD = _mF;
		this.femaleFriend = fF;
		this.noOfFemaleFriends = _noOffF;
		this.noOfMaleFriends = _noOfmF;
		this.overalTrustingPeople = _trustResult;
	}
}

class RealityCheck {
	public void countingTrustingPeople() {
		JudgingPeople jP = new JudgingPeople("YES, I have", "No, I don;t  have", 4, 0, 4.6);

		if (jP instanceof Trustable) {
			System.out.println("Trustable Male Friend, I have - " + jP.maleFriendD);
			System.out.println("Trustable Female Friend, I have" + jP.femaleFriend);
			System.out.println("No. of Trustable Male Friends - " + jP.noOfMaleFriends);
			System.out.println("No. of Trustable Female Friends - " + jP.noOfFemaleFriends);
			System.out.println("Fianl Result after Jusging all surrounding people - " + jP.overalTrustingPeople);
		} else {
			System.err.println("You haven't access to check someone's personal people surrounding");
		}

	}
}

public class PeopleCheck {
	public static void main(String[] args) {
		System.out.println("PeopleCheck.main()");

		RealityCheck rC = new RealityCheck();
		rC.countingTrustingPeople();

		/*
		 * on giving the access(implementing Marker Interface(Trustable))
		 * PeopleCheck.main() Trustable Male Friend, I have - YES, I have Trustable
		 * Female Friend, I haveNo, I don;t have No. of Trustable Male Friends - 4 No.
		 * of Trustable Female Friends - 0 Fianl Result after Jusging all surrounding
		 * people - 4.6
		 *
		 */

	}

	/*
	 * When don't have the access - PeopleCheck.main() You haven't access to check
	 * someone's personal people surrounding
	 */
}
