	package in.mahajanDevelopers;

	public class CallingtoStaticMethod {

		public static void main(String[] args) {
			System.out.println("Starting from here -- >");

			CallingtoStaticMethod c = new CallingtoStaticMethod();
			c.methodCallChecking();

			System.out.println("public/private waala method checked successfully ---->");

			CallingtoStaticMethod.methocCallCheckongByStatic();
			System.out.println();

			System.out.println("Static Method waala call done successfully even without creating object because declared STATIC---------------->");

		}

		private void methodCallChecking() { // if i declare any method as private then it can be accessible inside the same
											// class but not by other classes even though within the same package
			System.out.println("CallingStaticMethod.methodCallChecking()");
			System.out.println("Tryiing to checking method which declared as public/private");
		}

		static void methocCallCheckongByStatic() {
			System.out.println("CallingtoStaticMethod.methocCallCheckongByStatic()");
			System.out.println("Tryiing to checking method which declared as static");

		}

	}
