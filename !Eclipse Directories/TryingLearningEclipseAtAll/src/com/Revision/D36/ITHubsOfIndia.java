package com.Revision.D36;

public class ITHubsOfIndia implements Cloneable {
	String cityName;
	int majorLocations;
	String cityStandard;
	String cityEnvironment;
	double AIQOfCity;

	public ITHubsOfIndia(String _cityName, int _majorLocations, String _cityStandard, String _cityEnvironment,
			double _AIQOfCity) {
		this.cityName = _cityName;
		this.majorLocations = _majorLocations;
		this.cityStandard = _cityStandard;
		this.cityEnvironment = _cityEnvironment;
		this.AIQOfCity = _AIQOfCity;

	}

	@Override
	public ITHubsOfIndia clone() throws CloneNotSupportedException {
		return (ITHubsOfIndia) super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("TryingCloneableInterface.main()");
		ITHubsOfIndia iH = new ITHubsOfIndia("Bangalore", 4, "Top Tier", "Very Good specialy Weather", 5.5);
		ITHubsOfIndia iH2 = iH.clone();

		System.out.println("iH details are  - " + iH.cityName + " , " + iH.majorLocations + " , " + iH.cityStandard
				+ " , " + iH.cityEnvironment + " , " + iH.AIQOfCity);
		System.out.println("iH2 details are  - " + iH2.cityName + " , " + iH2.majorLocations + " , " + iH2.cityStandard
				+ " , " + iH2.cityEnvironment + " , " + iH2.AIQOfCity);

		if(iH instanceof Cloneable)
		{
			System.out.println("Its an insatncee so having access and can copy the object info comfortably");
		}
		else
		{
			System.out.println("Sorry, don;t have access can;t do this ");
		}
	}

}
