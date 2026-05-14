package com.Revision.D43;

import java.util.zip.DataFormatException;

public class A2_MultipleExceptionHandlesTogether {
	public static void main(String[] args) {

		try
		{

		}
		catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException | DataFormatException e)
		{
			e.printStackTrace();

		}
	}
}
