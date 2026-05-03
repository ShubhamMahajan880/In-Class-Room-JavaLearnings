package com.Revision.D27;

class Calculus {
	protected NewReturnSystem MathematicalSystem() {
		return new NewReturnSystem("CalculasMathematics");
	}

	NewReturnSystem VedicMathematics()
	{
		return new NewReturnSystem(3.17141654897);
	}
}

class IntegralCalculus extends Calculus {
	@Override
	public NextLevelReturnSystem MathematicalSystem() {
		return new NextLevelReturnSystem("Its Integral Calculus", 8);
	}

}

public class ReturnWaalaOverride {
	public static void main(String[] args) {
		System.out.println("ReturnWaalaOverride.main()");
		Calculus cS = new Calculus();
		cS.MathematicalSystem();

		IntegralCalculus iC = new IntegralCalculus();
		iC.MathematicalSystem();
		iC.VedicMathematics();
	}
}
