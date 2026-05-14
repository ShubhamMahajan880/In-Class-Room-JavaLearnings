package com.Revision.D42;

public class A55_Final2 {

	public static void main(String[] args) throws NullPointerException{

		String laptop = null;

		try
		{
			System.out.println("Try - START");

			System.out.println("laptop length is - "+laptop.length());

			System.out.println("Try - END");
		}
		catch(NullPointerException e)
		{
			System.out.println("I am pointing to nulling objetcs which nullify");
			e.printStackTrace();
		}
		finally
		{
//			laptop.close();
			System.out.println("can;t do this action");
		}

	}

}
