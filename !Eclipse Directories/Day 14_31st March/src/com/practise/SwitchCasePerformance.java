package com.practise;

public class SwitchCasePerformance {
	public static void main(String[] args) {
		String userType = "Gold";

		switch (userType) {
		case "Bronze":
			System.out.println("Sorry, You won't get any discount");
			break;
		case "Silver":
			System.out.println("You'll get 5% off on Jewellery");
			break;
		case "Gold":
			System.out.println("You'll get 10% off for sure. Just make the purchases");
			break;
		case "Platinum":
			System.out.println("YOu'll ghet 20% off... Keep SHopping");
			break;
		default:
			System.out.println("No Discount Available, Not at all");
			break;

		}
	}

}
