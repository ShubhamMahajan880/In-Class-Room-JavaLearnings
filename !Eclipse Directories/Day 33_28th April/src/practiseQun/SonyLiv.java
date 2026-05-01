package practiseQun;

public class SonyLiv implements OTTDetails {

	@Override
	public void signUp() {
		System.out.println("SonyLiv.signUp()");

	}

	@Override
	public void login() {
		System.out.println("SonyLiv.login()");

	}

	@Override
	public void subscribe() {
		System.out.println("SonyLiv.subscribe()");

	}

	@Override
	public void cancelSubscription() {
		System.out.println("SonyLiv.cancelSubscription()");

	}

	@Override
	public void addToWatchList() {
		System.out.println("SonyLiv.addToWatchList()");

	}

	@Override
	public void viewMostTrending() {
		System.out.println("SonyLiv.viewMostTrending()");

	}

	public static void main(String[] args) {
		System.out.println("Here is your SonyLive details - ");
		SonyLiv slV = new SonyLiv();
		slV.signUp();
		slV.login();
		slV.subscribe();
		slV.cancelSubscription();
		slV.addToWatchList();
		slV.viewMostTrending();
	}

}
