package Collection.Framework;

import java.util.HashSet;
import java.util.Set;

class Employee {

	@Override
	public int hashCode() {

		return 12344321;
	}
}

public class A3_TryingToForceHashcode {

	public static void main(String[] args) {
		Set<Employee> emps = new HashSet<Employee>(16);

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		System.out.println(e1.hashCode() + " and " + e2.hashCode()); // 12344321 and 12344321


	}

}
