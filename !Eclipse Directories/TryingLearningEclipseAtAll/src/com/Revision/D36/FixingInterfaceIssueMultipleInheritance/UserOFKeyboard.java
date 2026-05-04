package com.Revision.D36.FixingInterfaceIssueMultipleInheritance;

public class UserOFKeyboard implements IMechanicalKeyboard, IMembraneKeyboard {

	@Override
	public void keyPressSound()
	{
		System.out.println("UserOFKeyboard.keyPressSound()");
		System.out.println("What makes you to buy this keybaord ");
		IMechanicalKeyboard.super.keyPressSound();
		IMechanicalKeyboard.super.backlitType();
	}

	@Override
	public void backlitType()
	{
		System.out.println("UserOFKeyboard.backlitType()");
		System.out.println("Main reason to purchase");
		IMechanicalKeyboard.super.keyPressSound();
		IMembraneKeyboard.super.backlitType();
	}

	public static void main(String[] args) {
		UserOFKeyboard uK = new UserOFKeyboard();
		uK.keyPressSound();
		System.out.println("----------->");
		uK.backlitType();
	}
}
