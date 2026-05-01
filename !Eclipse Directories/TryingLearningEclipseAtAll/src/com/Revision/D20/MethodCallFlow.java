package com.Revision.D20;

public class MethodCallFlow {

	public void method1() {
		method2();
		System.out.println("MethodCallFlow.method1()");
	}

	public void method2() {
		method3();
		System.out.println("MethodCallFlow.method2()");
	}

	public void method3() {
		//method1();
		System.out.println("MethodCallFlow.method3()");
	}

	public MethodCallFlow() {
		System.out.println("MethodCallFlow.MethodCallFlow() - 4");
	}

	public MethodCallFlow(String nameGiven) {
		System.out.println("MethodCallFlow.MethodCallFlow() - 5");
	}

	public MethodCallFlow(int amount) {
		System.out.println("MethodCallFlow.MethodCallFlow() - 6");
	}

	public MethodCallFlow(int payment, String personName) {
		System.out.println("MethodCallFlow.MethodCallFlow() - 7");
	}

	public static void main(String[] args) {
		System.out.println("MethodCallFlow.main()");
		MethodCallFlow mC = new MethodCallFlow();
		mC.method1();
		mC.method2();
		mC.method3();


	}

}
