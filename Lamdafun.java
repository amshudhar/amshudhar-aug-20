package com.javanew;

interface Test{
	public void m1();
}

//class Lam implements Test{
//
//	@Override
//	public void m1() {
//		System.out.println("good morning");
//		
//	}
//	
//}

public class Lamdafun {
	
	public static void main(String[] args) {
		
//		Lam l=new Lam();
//		l.m1();
		
		Test t=()-> {System.out.println("Hello world");};
		
		t.m1();
		
	}
		
}
