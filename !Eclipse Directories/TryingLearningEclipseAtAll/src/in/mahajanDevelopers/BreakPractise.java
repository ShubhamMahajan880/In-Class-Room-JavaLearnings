package in.mahajanDevelopers;

public class BreakPractise {

	public void nicheSelection() {
		String skillShouldBe = "AiWebSitrDevelopment";

		String skillSelection[] = { "AppDevelopment", "WebDevelopment", "AiWebSitrDevelopment", "ContentCretion",
				"AiTools" };

		for (int index = 0; index < skillSelection.length; index++) {
			System.out.println(skillSelection[index]);
			if (skillSelection[index] == skillShouldBe) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Learning break Keyword adn using in programming - ");
		BreakPractise p = new BreakPractise();
		p.nicheSelection();

		System.out.println("break statement working methodilogy completd");

	}

}
