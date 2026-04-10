package com.Revision;

class Netflix {
	public static int liveUser = 0;
	public String userName;
	public String userType;

	public Netflix(String _userName, String _userType) {
		this.userName = _userName;
		this.userType = _userType;
		System.out
				.println("User ID - " + liveUser + " User Name is - " + _userName + "& the User type is - " + userType);

	}

	{
		liveUser += 1;
	}
}

public class R2LiveUsers {

	public static void main(String[] args) {
		System.out.println("So, our uder details are as follwing - ");
		Netflix nF1 = new Netflix("Shubham", "Premium");
		Netflix nF2 = new Netflix("Shell", "Premium");
		Netflix nF3 = new Netflix("Manas", "Premium");
		Netflix nF4 = new Netflix("Mahendra", "Premium");
		Netflix nF5 = new Netflix("Meet", "Premium");
		Netflix nF6 = new Netflix("Pankaj", "Premium");

	}

}
