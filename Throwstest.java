package com.exception;

class Agenotvalid extends Exception{
	
	private int age;
	
	public Agenotvalid(int age) {
		this.age=age;
	}
	public String toString(){
		return("you are not eligible....");
	}
}

public class Throwstest {
	
	static void validateage(int age) throws Agenotvalid {
		if(age<18) {
			throw new Agenotvalid(age);
		}
		else {
			System.out.println("you are eligible");
		}
	}
	
	public static void main(String[] args) throws Agenotvalid{
		
		Throwstest.validateage(2);
		System.out.println("executing the 1000 lines");
		
	}

}
