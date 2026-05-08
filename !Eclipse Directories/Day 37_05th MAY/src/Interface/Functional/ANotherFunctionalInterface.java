package Interface.Functional;

@FunctionalInterface // FuncitonalInterdace Annotation
public interface ANotherFunctionalInterface {

	void tryingFunctional(); // only one abstract method compulsory

	public default void method1() // funcitonalinterface can have multiple nonabstract method
	{

	}
	public default void method2()
	{

	}
	public default void method3()
	{

	}
	public default void method4()
	{

	}
}
