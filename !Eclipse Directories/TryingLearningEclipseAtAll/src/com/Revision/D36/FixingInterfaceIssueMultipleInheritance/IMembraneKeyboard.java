package com.Revision.D36.FixingInterfaceIssueMultipleInheritance;

public interface IMembraneKeyboard {
	default void keyPressSound() {
		System.out.println(
				"IMembraneKeyboard.keyPressSound() - This is the defult mesaage of method keyPressSound in Parent IMembraneKeyboard");
	}

	default void backlitType() {
		System.out.println(
				"IMembraneKeyboard.backlitType() - This is the defult mesaage of method backlitType in Parent IMembraneKeyboard");
	}
}
