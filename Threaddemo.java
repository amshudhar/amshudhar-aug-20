package com.multithread;

public class Threaddemo extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("good morning");
	}
	}
	
	public static void main(String[] args) {
		
		Threaddemo td=new Threaddemo();
		td.run();
		td.start();
		
		for(int j=0;j<10;j++) {
			System.out.println("hello");
		}
		
		
	}
	
	

}
