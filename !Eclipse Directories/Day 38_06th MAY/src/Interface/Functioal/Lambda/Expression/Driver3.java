package Interface.Functioal.Lambda.Expression;

public class Driver3 {

	public static void main(String[] args) {
		ISquareRoot isQ = (i) -> Math.sqrt(i);

		int ans = isQ.sqrt(4);
		System.out.println(ans);


	}

}
