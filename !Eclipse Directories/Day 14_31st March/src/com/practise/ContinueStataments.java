package com.practise;

public class ContinueStataments {
	public static void main(String[] args) {
		String[] budgetProducts = { "Samsung Galaxy M07 Smartphone", null, "POCO C71 Budget Phone",
				"Motorola G35 5G Phone", "Nokia C32 Budget Smartphone", "Redmi A4 5G Phone",
				"Redmi Watch 5 Active Smartwatch", null, "Fire-Boltt Ninja Call Pro Smartwatch",
				"boAt Wave Call Smartwatch", "Fastrack Revoltt XR1 Smartwatch", "CMF by Nothing Watch Pro Smartwatch",
				"Campus Running Shoes", "Nivia Marathon Running Shoes", "Sparx Sports Shoes", "Asian Running Shoes",
				"Decathlon Kalenji Jog Shoes", "Adidas Duramo Budget Running Shoes", "Boat Airdopes Budget Earbuds",
				"Realme Buds Wireless Earphones", "Noise Buds VS Series", "Zebronics Bluetooth Headphones", null,
				"Ambrane Power Bank", "Portronics Charging Cable", "HP Wired Mouse", "Logitech Budget Keyboard",
				"Dell Basic Monitor", "Wildcraft Backpack", "Skybags Casual Backpack" };

		for (int i = 0; i < budgetProducts.length; i++) {
			String rangeProducts = budgetProducts[i];
			if (rangeProducts == null) {

				continue;
			}
			System.out.println(rangeProducts.toUpperCase());
		}
	}

}
