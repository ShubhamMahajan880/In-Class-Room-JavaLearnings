package Interface.in.mahajanDevelopers;

//1997 --> 2026
interface JavaSyllabus {
	void coreJava();

	void advanceJava();

	default void mavenProjects() {
		System.out.println("Yh Default Access he - JavaSyllabus.mavenProjects() - MAVEN");
	}

	public abstract void springBoot();

	default void hiberNet() {
		System.out.println("Yh Optional Access he - JavaSyllabus.hiberNet() - Good TO Have");
	}

}

class FresherStudent implements JavaSyllabus {
	@Override
	public void coreJava() {
		System.out.println("FresherStudent.coreJava()");

	}

	@Override
	public void advanceJava() {
		System.out.println("FresherStudent.advanceJava()");
	}

	@Override
	public void springBoot() {
		System.out.println("FresherStudent.springBoot()");
	}

	@Override
	public void hiberNet() {
		System.out.println("FresherStudent.hiberNet()");
	}
}

class WorkingPeople implements JavaSyllabus {

	@Override
	public void coreJava() {
		System.out.println("WorkingPeople.coreJava()");

	}

	@Override
	public void advanceJava() {
		System.out.println("WorkingPeople.advanceJava()");

	}

	@Override
	public void springBoot() {
		System.out.println("WorkingPeople.springBoot()");

	}

	@Override
	public void mavenProjects() {
		System.out.println("WorkingPeople.mavenProjects()");
	}
}

class NonTechProfiles implements JavaSyllabus {

	@Override
	public void coreJava() {
		System.out.println("NonTechProfiles.coreJava()");

	}

	@Override
	public void advanceJava() {
		System.out.println("NonTechProfiles.advanceJava()");

	}

	@Override
	public void springBoot() {
		System.out.println("NonTechProfiles.springBoot()");

	}

	@Override
	public void mavenProjects() {
		System.out.println("NonTechProfiles.mavenProjects()");
	}

	@Override
	public void hiberNet() {
		System.out.println("NonTechProfiles.hiberNet()");
	}

}

public class DefaultMethodInInterrface {

	public static void main(String[] args) {
		System.out.println("DefaultMethodInInterrface.main() - After Java 7 updates in Interface of Java 8");

		FresherStudent fS = new FresherStudent();
		fS.coreJava();
		fS.advanceJava();
		fS.springBoot();
		fS.mavenProjects();
		fS.hiberNet();
		System.out.println("----------->");

		WorkingPeople wP = new WorkingPeople();
		wP.coreJava();
		wP.advanceJava();
		wP.springBoot();
		wP.mavenProjects();
		wP.hiberNet();
		System.out.println("------------->");

		NonTechProfiles nT = new NonTechProfiles();
		System.out.println("No Optional for Non-Tech profiles.. Compulsory do for them");
		nT.coreJava();
		nT.advanceJava();
		nT.springBoot();
		nT.mavenProjects();
		nT.hiberNet();

	}

}
