
public class ObjectMemoryUnderstanding {

	public static void main(String[] args) {
		String s1 = "Pune";//in SCP
		String s2 = "Pune"; // 1 object created - not created new already in SCP

		System.out.println(s1 == s2);//true - comparing by object address. On that Object addrsses references are same.

		String s3 = "Amdavad"; // in S3 - SCP
		String s4 = new String("Amdavad");// in S3 & S4 - 2 object created - in SCP + Heap
		String s5 = new String("Surat"); // in S3 & S5 - 3 objects created, SCP + (SCP + Heap)


		System.out.println(s3 == s4);//False
		System.out.println(s3.equals(s4)); //True // comparing by content inside String
		System.out.println(s3.equals(s5));//False

	}

}
