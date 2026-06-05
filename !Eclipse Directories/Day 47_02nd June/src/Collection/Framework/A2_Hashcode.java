package Collection.Framework;


class Person
{

}

public class A2_Hashcode {

	public static void main(String[] args) {


		String s1 = "Microsoft";
		String s2 = "Microsoft";
		String s3 = "microsoft";
		String s4 = "microsoft";


		System.out.println(s1.hashCode());//1909739726
		System.out.println(s2.hashCode());//1909739726 - same string same hascode, same pointing address in memory as same word having same hashcode.

		System.out.println(s3.hashCode());//-94228242
		System.out.println(s4.hashCode());//-94228242



		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.hashCode());//366712642 - hashcode of p1 object of person class.(unique Number, wherre the number stored in the memory)
		System.out.println(p2.hashCode());//1829164700 - 2 different hashcodes as 2 different object created.




	}

}
