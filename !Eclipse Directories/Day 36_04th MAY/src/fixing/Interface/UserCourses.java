package fixing.Interface;

public class UserCourses implements ITechnicalCourses, ISkillDevelopmentCourses{

	@Override
	public void syllabus() { //after Java 7 version, in the Java 8, we use default method, so we can implement Multiple Inheritance without Ambuguity

		ITechnicalCourses.super.syllabus(); // it's my x method - using super we are able to select which parents method we want to implement.
		ISkillDevelopmentCourses.super.syllabus();// it's my y method

	}

}
