
public class MethoCallWorking {

	public static void main(String[] args) {
		MethoCallWorking mCW = new MethoCallWorking();
		mCW.m1();
		System.out.println("MethoCallWorking.main()");
	}

	public void m1() {
		m2();
		System.out.println("MethCallWorking.m1()");
	}

	public void m2() {
		m3();
		System.out.println("MethCallWorking.m2()");
	}

	public void m3() {
		System.out.println("MethCallWorking.m3()");

	}

}

/*
 * MethCallWorking.m3() MethCallWorking.m2() MethCallWorking.m1()
 * MethoCallWorking.main()
 */

