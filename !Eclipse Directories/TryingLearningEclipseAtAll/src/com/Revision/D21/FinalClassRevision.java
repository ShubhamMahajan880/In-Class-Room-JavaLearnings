package com.Revision.D21;

final class BankingSystem {
	public void simpleMethod() {
		System.out.println(
				"I am about to be Parent, but this finalkeyword is not allowing me now.. means i was a parent class untill final was not there");
	}
}

public class FinalClassRevision extends BankingSystem {

	public static void main(String[] args) {
		System.out.println("Using me as  a child class");

	}

}
