package com.javanew;

//class Runn implements Runnable{
//
//	@Override
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println("this is child class");
//		}
//		
//	}
//	
//}

public class Runnabled {
	
	public static void main(String[] args) {
		
//		Runn r=new Runn();
//		
//		Thread t=new Thread(r);
//		t.start();
		
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println("this is child thread");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("this is main thraed");
		}
		
	}
	
	

}
