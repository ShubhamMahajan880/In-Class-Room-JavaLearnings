package types.exception;

public class UncheckedException {

	public static void main(String[] args) {
		String name = 	null;
		System.out.println(name.length());// NPE/Unchecked/Runtime Exception

	}

	/*
	 * Exception in thread "main" java.lang.NullPointerException at
	 * types.exception.UncheckedException.main(UncheckedException.java:7)
	 */
}
