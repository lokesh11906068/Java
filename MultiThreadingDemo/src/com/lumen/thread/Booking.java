package com.lumen.thread;

public class Booking {

public double bookTickets(String name,int noOfTickets) {
	double costPerTicket = 200;;
	System.out.println("Booked For:"+name);
	double totalPrice= costPerTicket*noOfTickets;
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Total:"+totalPrice);
	return totalPrice;
}

}
