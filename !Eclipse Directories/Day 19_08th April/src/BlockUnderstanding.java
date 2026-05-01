
public class BlockUnderstanding {

	{
		System.out.println("Inside IIB");
	}

	public BlockUnderstanding() {
		// 1st line will be super() always
		// 2nd call to init block
		System.out.println("Inside BlockUnderstanding() Constructor which is with no parametrs");
	}

	public BlockUnderstanding(int _amount) {
		System.out.println("Inside BlockUnderstanding.BlockUnderstanding(_amount)"); // jitni baar constrcuto bnayaenge
																						// phle Init Block ko call
																						// jaayga.. because it s
																						// Instance for all objects
	}

	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		BlockUnderstanding bU = new BlockUnderstanding();
		BlockUnderstanding bU1 = new BlockUnderstanding();
		BlockUnderstanding bU2 = new BlockUnderstanding(100);
	}

	static {
		System.out.println("Inside SIB ..... Only Once and  first of all becuase loaded into memory");
	}

}
