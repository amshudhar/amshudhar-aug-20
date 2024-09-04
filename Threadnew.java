package com.multithread;

public class Threadnew implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("eating...");
		}
		
	}
	
	public static void main(String[] args) {
		
		Threadnew tn=new Threadnew();
		Thread tt=new Thread(tn);
		
		tt.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("sleeping...");
		}
		
	}

	

}
