package com.lumen.thread;

//Creating Thread Class
class Child extends Thread{
	//Using Constructor
	public Child(String name,int priority) {
		super(name);
		this.setPriority(priority);
		System.out.println(this);
		this.start();
	}

	public void run() {
		String tName=Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(tName+" "+i);
		}
	}
}
public class ExtendThread {

	public static void main(String[] args) {
		Thread childThread=new Child("A",Thread.MAX_PRIORITY);
//		childThread.setName("lokesh");
//		childThread.setPriority(1);
		Thread childThread1=new Child("B",Thread.MIN_PRIORITY+3);
//		childThread1.setName("rakesh");
//		childThread1.setPriority(3);
		
		Thread childThread2=new Child("C",Thread.NORM_PRIORITY);
//		childThread2.setName("chitti");
//		childThread2.setPriority(2);
//		childThread.start();
//		childThread1.start();
//		childThread2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
