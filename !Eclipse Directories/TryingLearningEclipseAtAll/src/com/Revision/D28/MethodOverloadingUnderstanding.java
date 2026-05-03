package com.Revision.D28;

class UserLogin {
	public void loginMethods(int OTP, String password) {
		System.out.println("UserLogin.loginMethods()");
		System.out.println("So, the pass is - " + password);
		System.out.println("and the OTP is - " + OTP);
	}

	public void loginMethods(String hintPass, long aadharNumber) {
		System.out.println("UserLogin.loginMethods() - 2");
		System.out.println("hint of the passwors is - " + hintPass);
		System.out.println("Aadhar Number is  - " + aadharNumber);
	}

	public void loginMethods(String panNo, String imagePasss) {
		System.out.println("UserLogin.loginMethods() - 3");
		System.out.println("PAN No. is given for login is - " + panNo);
		System.out.println("Image Password for login is - " + imagePasss);
	}
}

public class MethodOverloadingUnderstanding {

	public static void main(String[] args) {
		System.out.println("MethodOverloadingUnderstanding.main()");
		System.out.println("Method Overloading Use cases and concepts - ");

		UserLogin uL = new UserLogin();
		uL.loginMethods(8877, "Jarvis@123");
		System.out.println("------------->");
//		uL.loginMethods("SchoolName", 444891538);
		System.out.println("------------->");
//		uL.loginMethods("Agfybvh@892L", "crushpressingpoints");
		System.out.println("------------->");

	}

}
