package com.Revision.D42;

import java.util.Iterator;

public class A3_TryingMultipleExceptionsAtATime {

	public static void main(String[] args) {

		System.out.println("A3_TryingMultipleExceptionsAtATime.main() - START");

		try {
			String name = null;
			String userDetails = args[0];
			int number = 11;

			System.out.println("Name length is - " + name.length());
			int result = number / 0;
			System.out.println("Details entered by user is - " + userDetails);
			System.out.println("Result declares is as  - " + result);
		} catch (NullPointerException e1) {
			System.out.println("String not null for getting the length");
			e1.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("user should enter details by cmd - ");
			e2.printStackTrace();
		}

		catch (ArithmeticException e3) {
			System.out.println("can;t devide by zero ever r");
			e3.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("yaha errrors shi krne se kuchh nhi hoga ..... you are late now.");
			e.printStackTrace();
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("All Catch blocks performed successfully " + i);
		}

		System.out.println("A3_TryingMultipleExceptionsAtATime.main() - END");
		System.out.println("After first try when rosky codes comes it jumps to respective exceptin adn then handle the exception .... try skips rest of the code after the firts excedption");
		System.out.println("So here i am not giving cmd arg so first exception occuring here which is handling by respective eceptopm - ArrayIndexOutOFBound, so other are not executing(even parent excpetin also can't execute  - as one exception fllowed by respective error in try) ");
	}

}
