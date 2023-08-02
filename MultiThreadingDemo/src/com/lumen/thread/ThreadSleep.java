package com.lumen.thread;

public class ThreadSleep {

	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		
		System.out.println(thread);
		
		thread.setName("locky");
		thread.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thread);


		int[] nums=null;
		System.out.println(nums[0]);
	}

}
