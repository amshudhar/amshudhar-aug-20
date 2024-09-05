package com.multithread;

class First{
	
	String msg;
	public synchronized void display(String msg) {
		System.out.print("["+msg);
		
		System.out.print("]");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Second extends Thread{
	String msg;
	First fst=new First();
	
	public Second(First fst,String msg) {
		this.msg=msg;
		this.fst=fst;
		this.start();
	}
	
	public void run() {
		fst.display(msg);
	}
}

public class Sync {
	
	
	public static void main(String[] args) {
		
		First fst=new First();
		Second s1=new Second(fst, "hello");
		Second s2=new Second(fst,"Welcome");
		Second s3=new Second(fst,"java");
		
	}

}
