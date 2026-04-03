package com.kodewala;

public class JavaGameDevelopment {
	public static void main(String[] args) {
		System.out.println("WE are here for developing a game");

		JavaGameDevelopment javaGame = new JavaGameDevelopment();
		javaGame.GameCreation();

		javaGame.GameStages();

		String name = args[0];
		String address = args[1];
		javaGame.GameCreation2(name, address);

	}

	public void GameCreation() {
		System.out.println("The plan is simila tto Vicity");
		System.out.println("Want to do as GTA 5");
	}

	public void GameCreation2(String _name, String _address) {
		System.out.println("The plan is simila tto Vicity");
		System.out.println("Want to do as GTA 5");
		System.out.println("Name is - " + _name + "& address is  - " + _address);

	}

	public void GameStages() {
		System.out.println("There will be 5 stages in total");

		FinalTouchtoLastStage finalStage = new FinalTouchtoLastStage();
		finalStage.LastStage();
		System.out.println("ANd after that agai will be 10 stages");

	}

}

class FinalTouchtoLastStage {

	public void LastStage() {
		System.out.println("The last stage is planned clearly ");
		System.out.println("Its in the Final Stage now");

	}


}