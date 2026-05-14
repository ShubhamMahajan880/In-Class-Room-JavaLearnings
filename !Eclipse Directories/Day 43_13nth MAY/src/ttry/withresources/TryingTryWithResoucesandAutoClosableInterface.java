package ttry.withresources;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author ASUS
 * @version
 */

public class TryingTryWithResoucesandAutoClosableInterface {

		public static void main(String[] args) {
			System.out.println("TryingTryWithResoucesandAutoClosableInterface.main()");

			try (BufferedReader bR = new BufferedReader(new FileReader(
					"E:\\51 _Shagun\\Java This Side\\In Class Room\\!Eclipse Directories\\Day 43_13nth MAY\\bin\\ttry\\withresources\\sales_data.txt"));) {
				String line;
				while ((line = bR.readLine()) != null) {
					System.out.println(line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	// finally block internally executing using try with resources which also uses AutoClosable Functional Interface
	/*try (BufferedReader bR = new BufferedReader(new FileReader(
	 * "E:\\51 _Shagun\\Java This Side\\In Class Room\\!Eclipse Directories\\Day 43_13nth MAY\\bin\\ttry\\withresources\\sales_data.txt"));)*/

}
