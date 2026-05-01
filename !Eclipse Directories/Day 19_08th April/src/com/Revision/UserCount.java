package com.Revision;

class membersIncrement {
	static int userNo = 0;
	{
		userNo += 1;
	}

	public membersIncrement(String userName, int userAge) {
		System.out.println("user count is - " + userNo + " User name is  - " + userName + " & userAge is - " + userAge);
	}

}

public class UserCount {

	public static void main(String[] args) {
		System.out.println("Details of the users are as following - ");
		membersIncrement mI = new membersIncrement("Ayush", 23);
		membersIncrement mI2 = new membersIncrement("Ayushi", 21);
		membersIncrement mI3 = new membersIncrement("Shell", 24);
		membersIncrement mI4 = new membersIncrement("Shelly", 22);
		membersIncrement mI5 = new membersIncrement("Harshit", 26);
		membersIncrement mI6 = new membersIncrement("Harshita", 24);
		membersIncrement mI7 = new membersIncrement("Madhur", 23);
		membersIncrement mI8 = new membersIncrement("Madhuri", 22);

	}

}
