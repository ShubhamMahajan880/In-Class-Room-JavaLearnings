package in.mahajanDevelopers;

public class SwitchCasePrctices {

	public static void main(String[] args) {
		System.out.println("Practising for Switch Case Statement  - ");
		String companyType = args[0];

		switch (companyType) {
		case "ServiceBased":
			System.out.println("No we dont have to work here long -- ");
			break;

		case "Startup":
			System.out.println("Can be try for thr internship purposes only");
			break;

		case "FintechForm":
			System.out.println("Go for it you can get the growth easily");
			break;

		case "ProductBased":
			System.out.println("Yhi pr kaam krna h bhai pane ko .. Don;t miss the opportunities at all ");
			break;

		default:
			System.out.println(
					"Ab yrr bhai job he krna h to khi na khi se to start krna hi h .. take any one offer and start doing FREELANCING");
			break;
		}

	}

}
