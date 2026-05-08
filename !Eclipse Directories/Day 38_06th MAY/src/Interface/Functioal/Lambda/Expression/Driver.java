package Interface.Functioal.Lambda.Expression;

public class Driver {

	public static void main(String[] args) {

		IAddition iA = (i,j) -> i+j; //{int sum = i+j; return sum;}; - internall it happening like.

		int sum = iA.add(15,5);
		System.out.println(sum);

	}

}
