package com.Revision.D41;

public class A1_CheckedExceptionExample {

	public static void main(String[] args) {
		String name = "";
		System.out.println("length of String is - " + name.length());

		try {
			Class.forName("A1_CheckedExceptionExample");

		} catch (ClassNotFoundException e) {
			System.out.println("String initialized a snull,so can;t perform any operation");
			e.printStackTrace();
		}

	}

}
