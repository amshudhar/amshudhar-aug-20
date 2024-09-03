package com.exception;

public class Throwdemo {
	
	public void Valid(int marks) {
		if(marks<35) {
			throw new ArithmeticException("you are failed.....");
		}
		else {
			System.out.println("you are passed "+marks);
		}
	}
	
	public static void main(String[] args) {
		Throwdemo td=new Throwdemo();
		td.Valid(16);          //76
		System.out.println("executing 1000 lines");
	}

}
