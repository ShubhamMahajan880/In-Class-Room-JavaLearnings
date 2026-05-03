package com.Revision.D32;

abstract class JobEligibility {

	JobEligibility() {
		super();
	}

	abstract void qualifiedExamGATE();

	abstract void codingDSA();

	public void developmentCourses() {
		System.out.println("JobEligibility.developmentCourses()");
		System.out.println("Its not complusory, it's optional - If you know then very very good");
	}

}

class HigherPackages extends JobEligibility {
	@Override
	public void qualifiedExamGATE() {
		System.out.println("HigherPackages.qualifiedExamGATE()");
		System.out.println("For Higher Packages you must be fulflled basic requiremebnts which are compulsory");
	}

	@Override
	public void codingDSA() {
		System.out.println("HigherPackages.codingDSA()");
		System.out.println("For Higher Packages you must be fulflled basic requiremebnts which are compulsory");
	}

	HigherPackages() {
		super();
	}

	@Override
	public void developmentCourses() {
		System.out.println("HigherPackages.developmentCourses()");
		System.out.println("Good TO Have");
	}
}

class LuxuryInJob extends JobEligibility {
	@Override
	public void qualifiedExamGATE() {
		System.out.println("LuxuryInJob.qualifiedExamGATE()");
		System.out.println("For afford Luxury in your job also , you should have basic requiremnets which mentioned");
	}

	LuxuryInJob() {
		super();
	}

	@Override
	public void codingDSA() {
		System.out.println("LuxuryInJob.codingDSA()");
		System.out.println("For afford Luxury in your job also , you should have basic requiremnets which mentioned");
	}

	@Override
	public void developmentCourses() {
		System.out.println("LuxuryInJob.developmentCourses()");
		System.out.println("Still i'd say - Good to Have");
	}
}

public class PlayingWithAbstraction {
	public static void main(String[] args) {
		System.out.println("PlayingWithAbstraction.main()");

		// JobEligibility jE =new JobEligibility(); // cant create the object of
		// abstract classs
		// jE.qualifiedExamGATE();
		// jE.codingDSA();
		// jE.developmentCourses();

		HigherPackages hP = new HigherPackages();
		hP.qualifiedExamGATE();
		hP.codingDSA();
		hP.developmentCourses();
		System.out.println("----------->");

		LuxuryInJob lJ = new LuxuryInJob();
		lJ.qualifiedExamGATE();
		lJ.codingDSA();
		lJ.developmentCourses();
		System.out.println("----------->");

		System.out.println(
				"Completely accessded to abstract as well as non abstract methods which is inide the abstract class and accessed from main method");

	}
}
