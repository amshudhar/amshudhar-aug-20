package com.multithread;

public class Threadjoin extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i am child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Threadjoin tj=new Threadjoin();
		tj.start();
		tj.sleep(30000);
		
		for(int i=0;i<10;i++) {
			System.out.println("i am main thread");
		}
		
	}

}
