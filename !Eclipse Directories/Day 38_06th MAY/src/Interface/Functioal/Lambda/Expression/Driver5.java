package Interface.Functioal.Lambda.Expression;

public class Driver5 {

	public static void main(String[] args) {
		ICaseChange iCC = (AnyString) -> AnyString.toUpperCase();

		String answerString = iCC.strChange("kodewalaacademy");
		System.out.println(answerString);

	}

}
