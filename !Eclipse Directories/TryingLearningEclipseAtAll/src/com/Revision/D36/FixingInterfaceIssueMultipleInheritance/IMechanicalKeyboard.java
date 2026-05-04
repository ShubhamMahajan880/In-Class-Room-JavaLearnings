package com.Revision.D36.FixingInterfaceIssueMultipleInheritance;

public interface IMechanicalKeyboard {
	default void keyPressSound() {
		System.out.println(
				"IMechanicalKeyboard.keyPressSound() - This is the defult mesaage of method keyPressSound in Parent IMechanocalKeyboard");

	}

	default void backlitType() {
		System.out.println(
				"IMechanicalKeyboard.backlitType() - This is the defult mesaage of method backlitType in Parent IMechanocalKeyboard");
	}
}
