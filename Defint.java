package com.javanew;

interface Left{
	default void m1() {
		System.out.println("i am left interface");
	}
	
	public static void display() {
		System.out.println("i am stsic display method");
	}
}

interface Right{
	default void m1() {
		System.out.println("i am right interface");
	}
}

public class Defint implements Left,Right{
	
	public void m1() {
		System.out.println("i am main class");
		Left.super.m1();
		Right.super.m1();
	}
	
	public static void main(String[] args) {
		
		Defint di=new Defint();
		di.m1();
		
		Left.display();
	}

	

}
