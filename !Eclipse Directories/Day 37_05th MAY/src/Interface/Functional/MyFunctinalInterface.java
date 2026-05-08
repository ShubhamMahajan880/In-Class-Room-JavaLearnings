package Interface.Functional;

@FunctionalInterface
public interface MyFunctinalInterface { // SAM --> Single ABstract Method

	String doSomething(); // public abstract String doSomething();

	public default void doNothing() {

	}

	/*
	 * Interface in which only one abstract method is called as Functional
	 * Interface. Functional interface uses anotation - @FunctionalInterface - to
	 * cross check and varify user must have only one abstract method Functional
	 * INterface can have multiple other Non abstract/default methods but there
	 * should must be only one Astract Method. Purpose of FUnctional Interface is -
	 * to achieve Lambda Expression. Functional Interfaces - Runnable, Callable. No
	 * confusuion which abstract method's variable is calling using functionl
	 * interface there is only one abstract method, so can call directly his
	 * varible. Functional Interface is also called as -
	 * "SAM --> Single ABstract Method". itss all since Java 1.8
	 */

}
