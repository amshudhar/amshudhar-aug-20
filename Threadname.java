package com.multithread;

public class Threadname extends Thread{
	
	public void run() {
		System.out.println("child thread name"+Thread.currentThread().getName());
		System.out.println("child priority"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		Threadname tn=new Threadname();
		Threadname tn1=new Threadname();
		
		tn.start();
		tn1.start();
		tn.setName("Amshu");
		tn.setPriority(7);
		
		
		
		System.out.println("main thread name "+Thread.currentThread().getName());
		System.out.println("main priority "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setName("welcome");
		Thread.currentThread().setPriority(2);
		
		System.out.println("main thread name "+Thread.currentThread().getName());
		System.out.println("main priority "+Thread.currentThread().getPriority());
		
	}
}
