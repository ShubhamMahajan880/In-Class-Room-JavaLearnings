package Interface.in.mahajanDevelopers;

abstract class PGFacilities {
	public abstract String goodWiFi();

	public abstract void goodFood();

	public void workingArea() {
		System.out.println("PGFacilities.workingArea() - should be good if existss inside PG");
	}

	public double ratingSystem() {
		System.out.println("PGFacilities.ratingSystem() - eavailable on the entry gate");
		return 0.0;
	}
}

class DevsheelasPGForMens extends PGFacilities {
	@Override
	public String goodWiFi() {
		System.out.println("DebsheelsPGForMens.goodWiFi()");
		return "Need to Improve a lot";
	}

	@Override
	public void goodFood() {
		System.out.println("DebsheelsPGForMens.goodFood()");
	}

	@Override
	public double ratingSystem() {
		System.out.println("DebsheelsPGForMens.ratingSystem()");
		System.out.println("Custom Rating System");
		return 10.5;
	}
}

class TeraBitesLuxuryPGFOrMens extends PGFacilities {
	@Override
	public String goodWiFi() {
		System.out.println("TeraBitesLuxuryPGFOrMens.goodWiFi()");
		return null;
	}

	@Override
	public void goodFood() {
		System.out.println("TeraBitesLuxuryPGFOrMens.goodFood()");
	}

	@Override
	public void workingArea() {
		System.out.println("TeraBitesLuxuryPGFOrMens.workingArea()");
		System.out.println("Her enecessary because working people are more ");
	}
}

class PuzzlesLivingPGForMens extends PGFacilities {
	@Override
	public String goodWiFi() {
		System.out.println("PuzzlesLivingPGForMens.goodWiFi()");
		return "Decentone";
	}

	@Override
	public void goodFood() {
		System.out.println("PuzzlesLivingPGForMens.goodFood()");
	}
}

public class AbstractClassRevision {

	public static void main(String[] args) {
		System.out.println("AbstractClassRevision.main() - Reviiosn of Abstract Class");
		// PGFacilities pF = new PGFacilities(); - can;t do - abstact classs dont have
		// objects

		DevsheelasPGForMens dM = new DevsheelasPGForMens();
		dM.goodWiFi();
		dM.goodFood();
		dM.ratingSystem();
		dM.workingArea();
		System.out.println("--------------->");

		TeraBitesLuxuryPGFOrMens tM = new TeraBitesLuxuryPGFOrMens();
		tM.goodWiFi();
		tM.goodFood();
		tM.ratingSystem();
		tM.workingArea();
		System.out.println("--------------->");

		PuzzlesLivingPGForMens pM = new PuzzlesLivingPGForMens();
		pM.goodWiFi();
		pM.goodFood();
		pM.ratingSystem();
		pM.workingArea();

	}

}
