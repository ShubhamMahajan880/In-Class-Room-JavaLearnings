package com.practise;

public class SwitchingNextLevel {
	public static void main(String[] args) {
		String userType = "Gold";

		SwitchingNextLevel obj = new SwitchingNextLevel();

		switch (userType) {
		case "Bronze":
			obj.CalculateDiscount(0);
			break;
		case "Silver":
			obj.CalculateDiscount(5);
			break;
		case "Gold":
				obj.CalculateDiscount(10);
			break;
		case "Platinum":
			obj.CalculateDiscount(20);
			break;
		default:
			obj.CalculateDiscount(0);
			break;
		}
	}

	public void CalculateDiscount(int discount) {
		System.out.println("Discount is " + discount + "%");
	}
}