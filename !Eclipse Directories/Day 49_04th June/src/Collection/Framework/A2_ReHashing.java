package Collection.Framework;

import java.util.HashSet;

public class A2_ReHashing {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>(16);

		set.add("BLR1");
		set.add("BLR2");
		set.add("BLR3");
		set.add("BLR4");
		set.add("BLR5");
		set.add("BLR6");
		set.add("BLR7");
		set.add("BLR8");
		set.add("BLR9");
		set.add("BLR10");
		set.add("BLR11");
		set.add("BLR12");

		System.out.println(set); // [BLR7, BLR6, BLR5, BLR10, BLR4, BLR3, BLR2, BLR1, BLR12, BLR11, BLR9, BLR8]
		set.add("BLR13");
 		System.out.println(set);// [BLR10, BLR12, BLR11, BLR9, BLR8, BLR13, BLR7, BLR6, BLR5, BLR4, BLR3, BLR2, BLR1]

	}

}
