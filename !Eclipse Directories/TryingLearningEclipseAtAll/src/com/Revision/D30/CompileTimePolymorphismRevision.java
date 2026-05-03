package com.Revision.D30;

public class CompileTimePolymorphismRevision extends MethodOverloadingPerfomance {
	public static void main(String[] args) {
		EarningMoneyInTech eM = new EarningMoneyInTech();
		eM.onlineWork("Dropshipping and Marketing Stuff", 10000);
		eM.onlineWork("Fully Online - Google Meets", 45000, "Service Based");
		eM.onlineWork(100, "AI Website Designing");
	}

}
