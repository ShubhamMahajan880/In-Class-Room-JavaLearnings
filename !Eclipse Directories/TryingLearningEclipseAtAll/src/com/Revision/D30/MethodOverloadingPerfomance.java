package com.Revision.D30;

class EarningMoneyInTech {
	public void onlineWork(String methodName, int expect) {
		System.out.println("In Online work the method here is - " + methodName);
		System.out.println("How much we can expect in this is - " + expect);

	}

	public void onlineWork(String modeofWork, int salary, String companyDetails) {
		System.out.println("Mode of work stabds for own work or company work - " + modeofWork);
		System.out.println("How much usually companies pay for ths " + salary);
		System.out.println("Comoany type and all are - " + companyDetails);
	}

	public void onlineWork(int standardRate, String freelancingSkill) {
		System.out.println("Which Freelancing Skill is this - " + freelancingSkill);
		System.out.println("How much pays per hour " + standardRate);
	}
}

public class MethodOverloadingPerfomance {

	public static void main(String[] args) {
		System.out.println("MethodOverloadingPerfomance.main()");
		System.out.println("Implementing Method Overloading here");

	}

}
