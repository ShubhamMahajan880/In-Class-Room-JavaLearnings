package handling.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyKeywordUnderstanding {

	public static void main(String[] args) throws IOException {

		BufferedReader br = null;

		try {

			System.out.println("Try Start........");

			br = new BufferedReader(new FileReader(
					"E:\\51 _Shagun\\Java This Side\\In Class Room\\!Eclipse Directories\\Day 42_12th MAY\\bin\\handling\\exceptions\\sales_data.txt"));
			// this code opens the conenction with your file

			String name = args[0]; // This code may throw exception

			System.out.println("Driver.main() -- Try End.......");

			// return entered input - 5
			//System.exit(0); // KIll JVM .

		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
			System.err.println("Name is not provided ");

		} catch (Exception e) {

			e.printStackTrace();
			System.err.println("Some Other Problem...");

		} finally {
			br.close(); // closing the file connection
			// Mandatory Executable Block.
			System.out.println("Driver Finally Block which will execute always");
		}
	}

	/*
	 * in the exception scenario - Try Start........
	 * java.lang.ArrayIndexOutOfBoundsException: 0 at
	 * handling.exceptions.FinallyKeywordUnderstanding.main(
	 * FinallyKeywordUnderstanding.java:21) Name is not provided Driver Finally
	 * Block which will execute always
	 */

	/*
	 * without expeciton - on passing arguement successfully Try Start........
	 * Driver.main() -- Try End....... Driver Finally Block which will execute
	 * always
	 */

	/*
	 * so its executed alwasys and close the progream - dont waste the resouces -
	 * memory, RAM, storage, CPU
	 * don;t  waste water example
	 */

	/*
	 * when System.exit(0); is activated, it kills the jvm after this
	 * .FinallyKeywordUnderstanding and only above written prigram excetued not
	 * afetr this o/p - Try Start........ Driver.main() -- Try End.......
	 */

}