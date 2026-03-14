class OrderInfo
{

	public static void main(String args[])
	{
		String OrderId = args[0];
		String ItemName = args[1];
		String Price = args[2];
		String Qty = args[3];
		String State = args[4];
		String DeliveryAddress = args[5];
		
		System.out.println("Order Id is - "+ OrderId);
		System.out.println("Name of the Item is - "+ ItemName);
		System.out.println("Price is - "+ Price);
		System.out.println("Qunatity is Id is - "+ Qty);
		System.out.println("State  is - "+ State);
		System.out.println("Delivery Address is  - "+ DeliveryAddress);	
	}
	
	
//E:\Java This Side\In Class Room\Day 4_13nth March>java OrderInfo 400 Iphone 100000 2 bengalurur 13nthCrossRoad
//Order Id is - 400
//Name of the Item is - Iphone
//Price is - 100000
//Qunatity is Id is - 2
//State  is - bengalurur
//Delivery Address is  - 13nthCrossRoad
	
}