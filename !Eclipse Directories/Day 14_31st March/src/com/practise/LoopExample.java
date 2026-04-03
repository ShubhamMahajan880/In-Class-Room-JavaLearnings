package com.practise;

public class LoopExample {
	public static void main(String[] args) {
		String cities[] = { "Chennai", "Bangalore", "Delhi", "Ahmedabad", "Gurugram", "Noida", "Pune" };

		for (int i = 0; i <= cities.length; i++) {
			if (cities[i] == "Bangalore") {
				System.out.println("Yes Bangalore Exist");
				return;
			}

		}

	}

}
