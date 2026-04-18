class ArrayCreation {
	public void learnString() {
		String companiesName[] = new String[5];

		companiesName[0] = "Microsoft";
		companiesName[1] = "Google";
		companiesName[2] = "Atlassian";
		companiesName[3] = "Adobe";
		companiesName[4] = "ServiceNow";

		String printingInfo = companiesName[3];
		System.out.println(printingInfo);// Adobe

		for (int i = 0; i < companiesName.length; i++) {
			String anotherPrint = companiesName[i];
//			System.out.println(anotherPrint);
			/*
			 * Microsoft Google Atlassian Adobe ServiceNow
			 */

			if (anotherPrint.startsWith("A")) {
				System.out.println(anotherPrint);
				/*
				 * Atlassian Adobe
				 */

			}

		}

	}
}

public class ArrayUnderstanding {
	public static void main(String[] args) {
		System.out.println("Learnign about strings in this sesison =");
		System.out.println("--------------->");
		ArrayCreation aC = new ArrayCreation();
		aC.learnString();	
	}
}
