package com.Revision.D36;

public class KeyboardUser implements IMechanicalKeyboard, IMembraneKeyboard {

	@Override
	public void keyPressSound() {
		System.out.println("KeyboardUser.keyPressSound()");
		System.out.println("This sound is everythging to buy ths");
	}

	@Override
	public void comfortAndDurability() {
		System.out.println("KeyboardUser.comfortAndDurability()");
		System.out.println("The only reason to take this keyboard");
	}

	public static void main(String[] args) {
		System.out.println("KeyboardUser.main()");
		System.out.println("Implementing Multiple Inheritance by Interface before Java 8");

		KeyboardUser kU = new KeyboardUser();
		kU.keyPressSound();
		kU.comfortAndDurability();

	}

}
