package Interface.in.mahajanDevelopers;

class MahindraBE6 implements IElectricEV {
	@Override
	public void aiSystem() {
		System.out.println("MahindraBE6.aiSystem()");
	}

	@Override
	public void safetyPillows() {
		System.out.println("MahindraBE6.safetyPillows()");
	}

	@Override
	public String welcomeScreenString() {
		System.out.println("MahindraBE6.welcomeScreenString()");
		return "Nicely Arranged";
	}

	@Override
	public boolean autoParkingMode() {
		System.out.println("MahindraBE6.autoParkingMode()");
		return true;
	}
}

class HyundaiEV implements IElectricEV {

	@Override
	public void aiSystem() {
		System.out.println("HyundaiEV.aiSystem()");

	}

	@Override
	public void safetyPillows() {
		System.out.println("HyundaiEV.safetyPillows()");

	}

	@Override
	public String welcomeScreenString() {
		System.out.println("HyundaiEV.welcomeScreenString()");
		return null;
	}

	@Override
	public boolean autoParkingMode() {
		System.out.println("HyundaiEV.autoParkingMode()");
		return true;
	}

}

public class CarsAvailabilityClass {

	public static void main(String[] args) {
		System.out.println("CarsAvailabilityClass.main() - Practisign Interface");
		MahindraBE6 mE = new MahindraBE6();
		mE.aiSystem();
		mE.safetyPillows();
		mE.welcomeScreenString();
		mE.autoParkingMode();
		System.out.println("----------------->");

		HyundaiEV hV = new HyundaiEV();
		hV.aiSystem();
		hV.safetyPillows();
		hV.welcomeScreenString();
		hV.autoParkingMode();

	}

}
