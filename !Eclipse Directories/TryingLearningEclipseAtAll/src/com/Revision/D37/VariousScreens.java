package com.Revision.D37;

class PersonalDevices implements DeviceAccessible {
	String androidPhone;
	String iPhone;
	int mobileDevices;
	String laptopWindows;
	String laptopMac;
	int laptopDevices;

	public PersonalDevices(String _androidPhone, String _iPhone, int _mobileDevices, String _laptopWindows,
			String _laptopMac, int _laptopDevices) {
		this.androidPhone = _androidPhone;
		this.iPhone = _iPhone;
		this.mobileDevices = _mobileDevices;
		this.laptopWindows = _laptopWindows;
		this.laptopMac = _laptopMac;
		this.laptopDevices = _laptopDevices;

	}

}

class MultipleDevices {
	public void printingDeviceInformation(Object obj) {

		if (obj instanceof DeviceAccessible) {
			PersonalDevices pD = (PersonalDevices) obj;
			System.out.println("Android Phone is - " + pD.androidPhone);
			System.out.println("Iphone is - " + pD.iPhone);
			System.out.println("No. of Mobile Devices are - " + pD.mobileDevices);
			System.out.println("Windows Laptop is - " + pD.laptopWindows);
			System.out.println("Mac Laptop is - " + pD.laptopMac);
			System.out.println("No. of Laptops we have is - " + pD.laptopDevices);
		} else {
			System.err.println("You don;t have access to see the devie info of this classs(person)");
		}
	}
}

public class VariousScreens {

	public static void main(String[] args) {
		System.out.println("VariousScreens.main()");
		PersonalDevices pD2 = new PersonalDevices("IQZ9SPRO", "Iphone 17 MAX PRO(Orange)", 2,
				"Asus Vivobook_Windows 11", "Mac OS", 3);
		MultipleDevices mD = new MultipleDevices();
		mD.printingDeviceInformation(pD2);

		/*
		 * When Deviceaccessible(Marker Interface) Implemented VariousScreens.main()
		 * Android Phone is - IQZ9SPRO Iphone is - Iphone 17 MAX PRO(Orange) No. of
		 * Mobile Devices are - 2 Windows Laptop is - Asus Vivobook_Windows 11 Mac
		 * Laptop is - Mac OS No. of Laptops we have is - 3
		 */

	}

	/*
	 * When no access to marker interface(Not implemented DeviceAccessible)
	 * VariousScreens.main() You don;t have access to see the devie info of this
	 * classs(person)
	 */

}
