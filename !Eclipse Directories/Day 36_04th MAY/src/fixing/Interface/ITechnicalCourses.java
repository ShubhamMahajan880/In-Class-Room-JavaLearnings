package fixing.Interface;

public interface ITechnicalCourses {
	default void syllabus()
	{
		System.out.println("ITechnicalCourses.syllabus()"); // x method
	}
}
