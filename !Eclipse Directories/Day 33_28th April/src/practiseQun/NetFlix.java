package practiseQun;

public class NetFlix implements OTTDetails{

	@Override
	public void signUp() {
		System.out.println("NetFlix.signUp()");

	}

	@Override
	public void login() {
		System.out.println("NetFlix.login()");

	}

	@Override
	public void subscribe() {
		System.out.println("NetFlix.subscribe()");

	}

	@Override
	public void cancelSubscription() {
		System.out.println("NetFlix.cancelSubscription()");

	}

	@Override
	public void addToWatchList() {
		System.out.println("NetFlix.addToWatchList()");

	}

	@Override
	public void viewMostTrending() {
		System.out.println("NetFlix.viewMostTrending()");

	}

	public static void main(String[] args) {
		System.out.println("Here is your NetFlix details - ");
		NetFlix nF = new NetFlix();
		nF.signUp();
		nF.login();
		nF.subscribe();
		nF.cancelSubscription();
		nF.addToWatchList();
		nF.viewMostTrending();
	}



}
