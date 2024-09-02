package com.exception;

import java.util.Scanner;

public class Trycatch {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a first number: ");
		int a=sc.nextInt();
		System.out.println("enter a second number: ");
		int b=sc.nextInt();
		try {
			int res=a/b;
			System.out.println("the div is : "+res);
		} 
		catch (ArithmeticException ae) {
			System.out.println("dont enter a zero");
		}
		
		
		System.out.println("exceuting 1000 lines");
	}
	
	

}
