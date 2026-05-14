package com.Revision.D39;

public class A11_ImplementingTryCacheinNPE {

	public static void main(String[] args) {

		System.out.println("A11_ImplementingTryCacheinNPE.main() - STARTED");
		String data = null;

		try {
			System.out.println(data.length());
		} catch (NullPointerException e) {
			System.out.println("String is null, so nothing here to get the length");
			//e.printStackTrace();
		}

		System.out.println("A11_ImplementingTryCacheinNPE.main() - END");
	}

	/*	when i am printing tarce also -
		A11_ImplementingTryCacheinNPE.main() - STARTED
		String is null, so nothing here to get the length
		java.lang.NullPointerException
			at com.Revision.D39.A11_ImplementingTryCacheinNPE.main(A11_ImplementingTryCacheinNPE.java:11)
		A11_ImplementingTryCacheinNPE.main() - END
	 */

	/*	when not printing trace -
		A11_ImplementingTryCacheinNPE.main() - STARTED
		String is null, so nothing here to get the length
		A11_ImplementingTryCacheinNPE.main() - END
	 */

}
