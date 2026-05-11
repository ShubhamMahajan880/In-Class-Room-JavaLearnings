package types.exception;

public class CheckedException {

	public static void main(String[] args) {

		String name = "";
		System.out.println(name.length()); // // NPE/Unchecked/Runtime Exception

//		Checked Exception

		try {
			Class.forName("types.exception.CheckedException5656"); // forcing to handle it because ClassNotFoundException is checked exception
			//Load or read file --> FileNotFoundExceptiomn
 			//SQL Exception
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * if i dont use the checked exception(using exception as per condition) - it
		 * gives error Unhandles Exception type ClassNotFoundException
		 */


	}

}
