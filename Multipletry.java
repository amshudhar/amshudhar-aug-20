package com.exception;

public class Multipletry {
	
	public static void main(String[] args) {
		
		
		
		try {
			int a[]=new int[4];
			a[3]=45;
			int age=45/0;
		} 
		catch (ArithmeticException ae) {
//			System.out.println("cant executive null values");
			//ae.printStackTrace();
			System.out.println(ae);
		}
		catch (NumberFormatException nf) {
			System.out.println("cant convert number");
		}
		catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("array is out of bound");
		}
		catch (Exception e) {
			System.out.println("it is exception");
		}
		finally {
			System.out.println("it is executed");
		}
		
		System.out.println("executing the 1000 lines");
		
	}

}
