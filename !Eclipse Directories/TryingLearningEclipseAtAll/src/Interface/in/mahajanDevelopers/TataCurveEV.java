package Interface.in.mahajanDevelopers;

public class TataCurveEV implements IElectricEV {

	@Override
	public void aiSystem() {
		System.out.println("TataCurveEV.aiSystem()");
	}

	@Override
	public void safetyPillows() {
		System.out.println("TataCurveEV.safetyPillows()");
	}

	@Override
	public String welcomeScreenString() {
		System.out.println("TataCurveEV.welcomeScreenString()");
		return "Good Additional Feature";
	}

	@Override
	public boolean autoParkingMode() {
		System.out.println("TataCurveEV.autoParking()");
		return false;
	}

	public static void main(String[] args) {
		System.out.println("TataCurveEV.main()");
		TataCurveEV tC = new TataCurveEV();
		tC.aiSystem();
		tC.safetyPillows();
		tC.welcomeScreenString();
		tC.autoParkingMode();

	}
}
