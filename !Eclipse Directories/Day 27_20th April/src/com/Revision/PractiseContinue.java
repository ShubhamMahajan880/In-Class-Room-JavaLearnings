package com.Revision;

class DevelopingSystems
{
	 CovarientPractices  codeUnderstanding(String syntax, int numbering) {
		System.out.println("Understanding Parent Class behaviour");
		return new CovarientPractices("syntax");

	}
}

class DevelopmentWork extends DevelopingSystems
{
	 ImplementingPractices codeUnderstanding(String synatax, int numbering)
	{
		System.out.println("Now Understanding Child Class & its Behaviour");
		return new ImplementingPractices("No QUn", 2500);
	}
}

public class PractiseContinue {

}
