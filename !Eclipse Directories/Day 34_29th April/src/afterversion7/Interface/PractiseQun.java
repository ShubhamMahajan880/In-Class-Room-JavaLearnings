package afterversion7.Interface;

//2012 --> 2024
interface IChatApplications {

	void group();

	void statusOrStory();

	void pinChat();

	default void channel() {
		System.out.println("IChatApplications.channel() - newly added defualt/optional functionality");
	}

	default void mentionsOrTag() {
		System.out.println("IChatApplications.mentionsOrTag()");
	}
}

class WhatsApp implements IChatApplications {

	@Override
	public void group() {
		System.out.println("WhatsApp.group()");

	}

	@Override
	public void statusOrStory() {
		System.out.println("WhatsApp.statusOrStory()");

	}

	@Override
	public void pinChat() {
		System.out.println("WhatsApp.pinChat()");

	}

}

class InstaGram implements IChatApplications {

	@Override
	public void group() {
		System.out.println("InstaGram.group()");

	}

	@Override
	public void statusOrStory() {
		System.out.println("InstaGram.statusOrStory()");

	}

	@Override
	public void pinChat() {
		System.out.println("InstaGram.pinChat()");

	}
	@Override
	public void mentionsOrTag() {
		System.out.println("InstaGram.mentionsOrTag()");
	}

}

class Telegram implements IChatApplications {

	@Override
	public void group() {
		System.out.println("Telegram.group()");

	}

	@Override
	public void statusOrStory() {
		System.out.println("Telegram.statusOrStory()");

	}

	@Override
	public void pinChat() {
		System.out.println("Telegram.pinChat()");

	}

	@Override
	public void channel() {
		System.out.println("Telegram.channel()");

	}

	@Override
	public void mentionsOrTag() {
		System.out.println("Telegram.mentionsOrTag()");
	}

}

public class PractiseQun {

	public static void main(String[] args) {
		Telegram tG = new Telegram();
		tG.group();
		tG.statusOrStory();
		tG.pinChat();
		tG.channel();
		tG.mentionsOrTag();

	}

}
