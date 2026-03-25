class OnlineShop
	{

		private int payment1 = 100; // variable - access modifier - Private 		
		String itemName; // variable - access modifier - default
			
		public void paidOrder() // (method created) - access modifier public
		{		
		}
		
		public static void main(String args) //(main method) - access modifier - public
		{		
		}
	}

	class OrderDetails
	{
		public void manageOrder()
		{
			OnlineShop entries = new OnlineShop();			 
			System.out.println(entries.payment1); // by creting object in another class trying to accessing var(feature) of previous class - cannot use it becuase amount is Pvt
		}
		// error: payment has private access in OnlineShop
	
}