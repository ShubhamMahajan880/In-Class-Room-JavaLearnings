package Interface.Functioal.Lambda.Expression;

public class Driver2 {
	public static void main(String[] args) {

		ISubstraction iS = (i, j) -> {
			int subst = i- j;
			return subst;
		};

		int subst = iS.diff(15, 5);
		System.out.println(subst);

	}
}
