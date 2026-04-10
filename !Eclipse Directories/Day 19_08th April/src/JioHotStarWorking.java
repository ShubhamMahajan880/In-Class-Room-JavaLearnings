
class User {
	public static int totalLiveUsers = 0;

	private String mobile;

	public User(String mobile) {
		this.mobile = mobile;
	}

	{
		totalLiveUsers = totalLiveUsers + 1; // IIB hmesha call hoga hi hoga jitne objects bnenge sb k liye
	}
}

public class JioHotStarWorking {

	public static void main(String[] args) {
		User u1 = new User("1111111111");
		User u2 = new User("2222222222");
		User u3 = new User("3333333333");
		User u4 = new User("4444444444");
		User u5 = new User("5555555555");
		User u6 = new User("6666666666");
		User u7 = new User("7777777777");
		User u8 = new User("8888888888");

		System.out.println("Current Live Users are  - " + User.totalLiveUsers);

	}

}
