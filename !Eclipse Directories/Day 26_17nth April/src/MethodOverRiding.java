
class Employee extends Object// Parent
{
	public void saySomething() {
		System.out.println("Hello!!");
	}
}

class Manager extends Employee {
	public void saySomething() {
		System.out.println("Hey, Bro..!!"); // - overriding by creaating own functionalities after parenting class.
		System.out.println("I want to have a word with you...");
	}
}

public class MethodOverRiding {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.saySomething(); // Hey, Bro..!! I want to have a word with you...

		Employee e = new Employee();
		e.saySomething();// Hello!!
	}



}
