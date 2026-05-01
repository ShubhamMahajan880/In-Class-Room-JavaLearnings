package practiseQun;

public class HotStar implements OTTDetails {

	@Override
	public void signUp() {
		System.out.println("HotStar.signUp()");
	}

	@Override
	public void login() {
		System.out.println("HotStar.login()");

	}

	@Override
	public void subscribe() {
		System.out.println("HotStar.subscribe()");

	}

	@Override
	public void cancelSubscription() {
		System.out.println("HotStar.cancelSubscription()");

	}

	@Override
	public void addToWatchList() {
		System.out.println("HotStar.addToWatchList()");

	}

	@Override
	public void viewMostTrending() {
		System.out.println("HotStar.viewMostTrending()");

	}

	public static void main(String[] args) {
		System.out.println("Here is your HotStar details - ");
		HotStar hS = new HotStar();
		hS.signUp();
		hS.login();
		hS.subscribe();
		hS.cancelSubscription();
		hS.addToWatchList();
		hS.viewMostTrending();

	}

}
