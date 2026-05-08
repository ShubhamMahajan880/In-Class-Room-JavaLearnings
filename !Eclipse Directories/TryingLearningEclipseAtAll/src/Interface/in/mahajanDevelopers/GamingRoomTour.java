package Interface.in.mahajanDevelopers;

interface IGamingSetup {
	void gamingChair();

	void portableTable();

	String nameFlowRGBLightsString1();

	int coolingFans();
}

class AtHome implements IGamingSetup {

	@Override
	public void gamingChair() {
		System.out.println("AtHome.gamingChair()");

	}

	@Override
	public void portableTable() {
		System.out.println("AtHome.portableTable()");

	}

	@Override
	public String nameFlowRGBLightsString1() {
		System.out.println("AtHome.nameFlowRGBLightsString1()");
		return "Light Flow - Shubham the Developer";
	}

	@Override
	public int coolingFans() {
		System.out.println("AtHome.coolingFans()");
		return 3;
	}
}

class InPG implements IGamingSetup {

	@Override
	public void gamingChair() {
		System.out.println("InPG.gamingChair()");

	}

	@Override
	public void portableTable() {
		System.out.println("InPG.portableTable()");

	}

	@Override
	public String nameFlowRGBLightsString1() {
		System.out.println("InPG.nameFlowRGBLightsString1()");
		return "text Flow - Develoeprs Room";
	}

	@Override
	public int coolingFans() {
		System.out.println("InPG.coolingFans()");
		return 1;
	}

}

class OnFlat implements IGamingSetup {

	@Override
	public void gamingChair() {
		System.out.println("OnFalt.gamingChair()");

	}

	@Override
	public void portableTable() {
		System.out.println("OnFalt.portableTable()");

	}

	@Override
	public String nameFlowRGBLightsString1() {
		System.out.println("OnFalt.nameFlowRGBLightsString1()");
		return "Hustelers neever stop";
	}

	@Override
	public int coolingFans() {
		System.out.println("OnFalt.coolingFans()");
		return 4;
	}
}

public class GamingRoomTour {
	public static void main(String[] args) {
		System.out.println("GamingRoomTour.main()");

		AtHome aH = new AtHome();
		aH.gamingChair();
		aH.portableTable();
		aH.nameFlowRGBLightsString1();
		aH.coolingFans();

		System.out.println("---------------->");

		InPG iP = new InPG();
		iP.gamingChair();
		iP.portableTable();
		iP.nameFlowRGBLightsString1();
		iP.coolingFans();

		System.out.println("---------------->");

		OnFlat oF = new OnFlat();
		oF.gamingChair();
		oF.portableTable();
		oF.nameFlowRGBLightsString1();
		oF.coolingFans();

	}
}
