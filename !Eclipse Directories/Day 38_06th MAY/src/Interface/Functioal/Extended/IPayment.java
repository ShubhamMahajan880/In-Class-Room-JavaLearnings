package Interface.Functioal.Extended;

public interface IPayment { //
	void pay();
}

@FunctionalInterface
interface IRefund extends IPayment
{
//	void settle(); - FuncitonalInterfdace cna onky havce one abstract method... which is in IPAYEMT.
}