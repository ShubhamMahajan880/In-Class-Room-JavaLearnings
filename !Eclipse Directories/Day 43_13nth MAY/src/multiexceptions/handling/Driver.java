package multiexceptions.handling;

public class Driver {

	public static void main(String[] args) {

		try {

		} catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
		}

	}

	/* using pipe(|), we can write multiple exceptions at a time. whichever will be written first will be executed first.
	 * There should not be any relaitonship among the exceptions - otherwise child first rule not followed */

}
