package com.kodewalaNew;
import com.kodewala.Order;

class OrderManagement
	{
		public void manageOrder()
		{
			Order order = new Order();
			System.out.println(order.amount); 
		}
		
	}
	

/* E:\51 _Shagun\Java This Side\In Class Room\Day 10_25th March>javac com/kodewalaNew/4_AccessingViaDifferentPackage.java
com\kodewalaNew\4_AccessingViaDifferentPackage.java:9: error: amount is not public in Order; cannot be accessed from outside package
                        System.out.println(order.amount);
                                                ^
1 error */


/* E:\51 _Shagun\Java This Side\In Class Room\Day 10_25th March>javac com/kodewalaNew/4_AccessingViaDifferentPackage.java
com\kodewalaNew\4_AccessingViaDifferentPackage.java:9: error: amount has private access in Order
                        System.out.println(order.amount);
                                                ^
1 error */




/* Different package - Default - NOTAccessible , Private - NOTAccessible */