package com.Revision.D33;

public class MoneyThinking implements IUnderstanding {

	@Override
	public void earnInDollars() {
		System.out.println("MoneyThinking.earnInDollars()");
	}

	@Override
	public void earnInEuro() {
		System.out.println("MoneyThinking.earninEuro()");
	}

	@Override
	public void earnInPound() {
		System.out.println("MoneyThinking.earnInPound()");
	}

	@Override
	public void financialFreedom() {
		System.out.println("MoneyThinking.fianacialFreedom()");
	}

	public static void main(String[] args) {
		System.out.println("PractisingInterafce.main()");
		MoneyThinking mT = new MoneyThinking();
		mT.earnInDollars();
		mT.earnInEuro();
		mT.earnInPound();
		mT.financialFreedom();

//		IUnderstanding iU = new IUnderstanding(); - can;t do this.. object of interface and abstarct class is not possible
	}
}
