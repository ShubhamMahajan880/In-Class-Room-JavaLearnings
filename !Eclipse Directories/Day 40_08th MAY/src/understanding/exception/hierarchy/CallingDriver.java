package understanding.exception.hierarchy;

public class CallingDriver {

	public static void main(String[] args) {

		System.out.println("Driver.main() -- START");
		Driver dR = new Driver();
		dR.doSomething();
		System.out.println("Driver.main() -- END");
	}
// - Now this class is directly using propreties/methods of another class - but this class don't know na ki in that classs there is exceptions(possible risk) ecists. ths clas dontnhave ahy signal what's happend in previous or accessing class.
//	Driver.doSomething()
//	Driver.doSomething()
//	Driver.doSomething()
//	Driver.doSomething()
//	Driver.doSomething()
//	java.lang.NullPointerException
//		at understanding.exception.hierarchy.Driver.doSomething(Driver.java:11)
//		at understanding.exception.hierarchy.CallingDriver.main(CallingDriver.java:7)


}
