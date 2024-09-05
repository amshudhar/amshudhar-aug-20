package com.multithread;

public class Threadsleep extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i am a child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Threadsleep ts=new Threadsleep();
		ts.start();
		ts.join(10000);
		
		for(int i=0;i<10;i++) {
			System.out.println("i am main method");
		}
		
	}

}
