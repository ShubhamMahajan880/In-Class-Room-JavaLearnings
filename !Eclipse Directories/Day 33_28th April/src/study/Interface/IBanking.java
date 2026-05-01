package study.Interface;

public interface IBanking // 100% Abstract
{
	public abstract void pay();

	public abstract void settlePayment();

	void addCard();// By default all the methods & Interface are always Public & Abstract in Interface.

	void modifyPayment(); // public abstract void modifyPayment;

}


