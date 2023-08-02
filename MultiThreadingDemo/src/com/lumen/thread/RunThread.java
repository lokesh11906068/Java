package com.lumen.thread;


class RunChild implements Runnable{
	Booking booking;
	int tickets;
	String counterName;

	public RunChild(String counterName, Booking booking, int tickets) {
		super();
		this.booking = booking;
		this.tickets = tickets;
		this.counterName = counterName;
		Thread thread=new Thread(this,counterName);
		thread.start();
	}

	public void run()
	{

		System.out.println(counterName);
		synchronized (booking) {
			double amount=booking.bookTickets(counterName, tickets);
			System.out.println(amount);
		}
		
	}
	
//	public void run() {
//		String tName=Thread.currentThread().getName();
//		for (int i = 0; i < 5; i++) {
//			System.out.println(tName+" "+i);
//		}
//	}
}
public class RunThread {

	public static void main(String[] args) {
//		 RunChild runChild=new RunChild();
//		 Thread thread=new Thread(runChild,"A");
//		 thread.start();
//		 Thread thread1=new Thread(runChild,"B");
//		 thread1.start();
		
		Booking booking=new  Booking();
		RunChild child1=new RunChild("Counter-A",booking,10);
		RunChild child2=new RunChild("Counter-B",booking,20);

		
	}

}
