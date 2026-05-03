package com.Revision.D34;

public interface IAdmissionPlans {
	void javaBackendDevelopment();

	void onlineInterviewPreparations();

	void placementPart();

	default void planAplanB() {
		System.out.println("IAdmissionPlans.planAplanB()");
		System.out.println("We also have one optional plan");
	}

	default void mockTest() {
		System.out.println("IAdmissionPlans.mockTest()");
		System.out.println("Good to take if you want good results");
	}
}

//public class BackwardCompatibility {
//	public static void main(String[] args) {
//		System.out.println("BackwardCompatibility.main()");
//	}
//}
