package com.Revision.D34;

class StudentsThinking implements IAdmissionPlans {

	@Override
	public void javaBackendDevelopment() {
		System.out.println("BackwardCompatibility.javaBackendDevelopment()");

	}

	@Override
	public void onlineInterviewPreparations() {
		System.out.println("BackwardCompatibility.onlineInterviewPreparations()");
	}

	@Override
	public void placementPart() {
		System.out.println("BackwardCompatibility.placementPart()");
	}

}

class WorkingProfessionalsThinking implements IAdmissionPlans {

	@Override
	public void javaBackendDevelopment() {
		System.out.println("WorkingProfessionalsThinking.javaBackendDevelopment()");

	}

	@Override
	public void onlineInterviewPreparations() {
		System.out.println("WorkingProfessionalsThinking.onlineInterviewPreparations()");

	}

	@Override
	public void placementPart() {
		System.out.println("WorkingProfessionalsThinking.placementPart()");

	}

	@Override
	public void planAplanB() {
		System.out.println("WorkingProfessionalsThinking.planAplanB()");
		System.out.println("best for working guys");
	}

	@Override
	public void mockTest() {
		System.out.println("WorkingProfessionalsThinking.mockTest()");
		System.out.println("This is also good");
	}
}

public class BackwardCompatibility {

	public static void main(String[] args) {
		System.out.println("BackwardCompatibility.main()");

		StudentsThinking sT = new StudentsThinking();
		sT.javaBackendDevelopment();
		sT.onlineInterviewPreparations();
		sT.placementPart();
		sT.planAplanB();
		sT.mockTest();

		WorkingProfessionalsThinking wP = new WorkingProfessionalsThinking();
		wP.javaBackendDevelopment();
		wP.onlineInterviewPreparations();
		wP.placementPart();
		wP.planAplanB();
		wP.mockTest();

	}
}
