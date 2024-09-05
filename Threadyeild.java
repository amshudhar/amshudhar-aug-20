package com.multithread;

public class Threadyeild extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i am a child thread");
			Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		
		Threadyeild ty=new Threadyeild();
		ty.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("i am main thread");
		}
		
	}

}
