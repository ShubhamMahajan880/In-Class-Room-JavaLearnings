package Proceeding.Interface;

public class CourseForUser implements ITechnicalCourses, ISkillDevelopmentCourses {

	@Override
	public void syllabus() { // valid till java 7 only - till no body in abstract, can use multiple inheritance
		System.out.println("CourseForUser.syllabus() - right now using Interface, able to performing multiple Inheritance untill methods are only abstract(Only What) and not initalized(How)");

	}
}
