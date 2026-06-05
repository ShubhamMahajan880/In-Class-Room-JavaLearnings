package Collection.Framework;

import java.util.HashSet;


class Name
{
	String name;
	public Name(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {

		return 4561;
	}
}
public class A3_AnalysisDataStructure {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("BLR1");
		set.add("BLR2");
		set.add("BLR3");
		set.add("BLR4");
		set.add("BLR5");
		set.add("BLR6");
		set.add("BLR7");
		set.add("BLR8");

		System.out.println(set);//[BLR8, BLR7, BLR6, BLR5, BLR4, BLR3, BLR2, BLR1]

		set.add("BLR9");

		System.out.println(set);

		set.add("BLR10");

		System.out.println(set);

		set.add("BLR11");

		System.out.println(set);



	}

}