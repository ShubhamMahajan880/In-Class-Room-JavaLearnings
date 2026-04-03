package com.practise;

public class BreakingStatement {
	public static void main(String[] args) {
		System.out.println("Main Method Initialized - ");

		BreakingStatement stB = new BreakingStatement();
		stB.checkCity();

		
		System.out.println("Main Method Terminated, Successfuly");

	}

	public void checkCity() {
		String cities[] = { "Bengaluru", "Hyderabad", "Pune", "Chennai", "Gurgaon", "Noida", "Mumbai", "Kolkata",
				"Ahmedabad", "Kochi" };

		for (int i = 0; i < cities.length; i++) {
			if (cities[i] == "Pune") {
				System.out.println("Matching Found - Let's move to this city");
				break;
			}
		}

	}

}
