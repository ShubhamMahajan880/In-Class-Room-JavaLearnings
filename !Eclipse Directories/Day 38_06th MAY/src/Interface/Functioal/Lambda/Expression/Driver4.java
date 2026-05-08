package Interface.Functioal.Lambda.Expression;

public class Driver4 {

	public static void main(String[] args) {
		ISquare iS = (i) -> i*i;

		int ans = iS.square(4);
		System.out.println(ans);
	}

}
