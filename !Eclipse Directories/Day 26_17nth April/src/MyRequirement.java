
class FreelanceingMethods
{
	public void SkillSelection() {
		System.out.println("Best nieche Selection for Freelancing");

	}
}

class AiAgentBuilder extends FreelanceingMethods
{
	public void SkillSelection() {
		System.out.println("I am picking Ai Agent Builder Way for Freelancing");

	}
}


class WebSiteDesigners extends FreelanceingMethods
{
	public void SkillSelection() {
		System.out.println("I'll take AI Website Development for Freelancing");

	}
}

class AppDevelopemnt extends FreelanceingMethods
{
	public void SkillSelection() {
		System.out.println("I'll select  App Development for Freelancing");

	}
}


public class MyRequirement {

	public static void main(String[] args) {
		System.out.println("DIfferent Methods to Do Freelancing - ");
		AppDevelopemnt aD = new AppDevelopemnt();
		aD.SkillSelection();

		WebSiteDesigners wD = new WebSiteDesigners();
		wD.SkillSelection();

		AiAgentBuilder aA = new AiAgentBuilder();
		aA.SkillSelection();

	}

}
