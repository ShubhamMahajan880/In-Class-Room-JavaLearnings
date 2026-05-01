package com.Revision.D16;

class Director {
	public Director() {
		this(966999988);
		System.out.println("Message Passing - 3, Director's this()");

	}

	public Director(double contactNumber) {
		System.out.println("Finally called to Natural Super which is Object");
		System.out.println("Message Passing - 2, Director's super()");
	}
}

class Principle extends Director {
	public Principle(String messageInside) {
		this(5.5f);
		System.out.println("Message Passing - 5, Principal's this()");
	}

	public Principle(float floatingNumber) {
		super();
		System.out.println("Message Passing - 4, Principal's super()");

	}
}

class Teacher extends Principle {
	public Teacher() {
		this(111);
		System.out.println("Message Passing - 7, Teacher's this()");

	}

	public Teacher(int blessedNumber) {
		super("Calling super() with arguements ths time");
		System.out.println("Message Passing - 6, Teacher's super()");
	}

}

class Student extends Teacher {
	public Student() {
		this("XEV9");
		System.out.println("Message Passing - 9, Students's this()");
	}

	public Student(String carName) {
		super();
		System.out.println("Message Passing - 8, Students's super()");
	}
}

public class SuperClassRevision {

	public static void main(String[] args) {
		System.out.println("SuperClassRevision.main()");

		System.out.println("Start - Student classs Object Creation");
		System.out.println("Message Passing - 1, Student's Object Created");
		Student s1 = new Student();
		System.out.println("Message Passing - 10, Object's class reached");
		System.out.println("End - by going till super parent - object");

	}

}
