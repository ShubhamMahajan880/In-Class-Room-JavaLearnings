package Collection.Framework;

import java.util.HashSet;
import java.util.Set;

class Naamee {
	String name;

	Naamee(String name) {
		this.name = name;
	}

	public int hashCode() {
		return 12345;
	}
}

public class A31_PractisingTreeify {

	public static void main(String[] args) {

		Set<Naamee> c = new HashSet<Naamee>(64);

		Naamee name1 = new Naamee("s1");
		Naamee name2 = new Naamee("s2");
		Naamee name3 = new Naamee("s3");
		Naamee name4 = new Naamee("s4");
		Naamee name5 = new Naamee("s5");
		Naamee name6 = new Naamee("s6");
		Naamee name7 = new Naamee("s7");
		Naamee name8 = new Naamee("s8");
		Naamee name9 = new Naamee("s9");
		Naamee name10 = new Naamee("s10");
		Naamee name11 = new Naamee("s11");
		Naamee name12 = new Naamee("s12");

		c.add(name1);//1
		c.add(name2);//2
		c.add(name3);//3
		c.add(name4);//4
		c.add(name5);//5
		c.add(name6);//6
		c.add(name7);//7
		c.add(name8);//8
		c.add(name9);//9
		c.add(name10);//10
		c.add(name11);//11
		c.add(name12);//12
		c.remove(name1);
		c.remove(name2);
		c.remove(name3);
		c.remove(name4);
		c.remove(name5);
		c.remove(name6);
		c.remove(name7);
		c.remove(name8);
		c.remove(name9);
		c.remove(name10);
		c.remove(name11);

	}

}
