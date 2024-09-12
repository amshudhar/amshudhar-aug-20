package com.project1;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Client {
	
	public static void main(String[] args) {
		
		HashMap<Integer,Employe> employe= new HashMap<Integer,Employe>();
		
		int empid=23456;
		
		while(true) {
		System.out.println("=====Employee Management System======");
		System.out.println("1.Add Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Get Employee");
		System.out.println("4.Delete Employee");
		System.out.println("5.Get all Employee");
		
		
		Scanner sc = new Scanner(System.in);
		int Option=sc.nextInt();
		
		switch(Option){
			case 1:
				System.out.println("===== Add Employee =====");
				
				System.out.println("Enter Employe Name");
				String empn=sc.next();
				System.out.println("Enter Employe Salary");
				int empsal=sc.nextInt();
				System.out.println("Enter Employe Address");
				String empaddress=sc.next();
				System.out.println("Enter Employe Email");
				String empmail=sc.next();
				
				Employe emp=new Employe(empn, empsal, empaddress, empmail);
				
				employe.put(++empid,emp);
				
				System.out.println("Employee Added Successfully "+ empid);
				
				break;
				
			case 2:
				System.out.println("===== Update Employee =====");
				
				System.out.println("Enter the Employee id: ");
				int eid=sc.nextInt();
				
				System.out.println("Enter Employe Name");
				String en=sc.next();
				System.out.println("Enter Employe Salary");
				int esal=sc.nextInt();
				System.out.println("Enter Employe Address");
				String eaddress=sc.next();
				System.out.println("Enter Employe Email");
				String email=sc.next();
				
				Employe e=new Employe(en, esal, eaddress, email);
				
				employe.put(eid, e);
				System.out.println("Employee Updated Sucess "+eid);
				
				break;
				
			case 3:
				System.out.println("===== Get Employee =====");
				
				System.out.println("Enter the Employee id");
				int eid1=sc.nextInt();
				Employe empob=employe.get(eid1);
				
				System.out.println(empob);
				
				break;
				
			case 4:
				System.out.println("===== Delete Employee =====");
				
				System.out.println("Enter the Employee id");
				int eid2=sc.nextInt();
				
				employe.remove(eid2);
				
				System.out.println("Employee Deleted Success "+eid2);
				
				break;
				
			case 5:
				System.out.println("===== Get all Employee =====");
				
				Set<Entry<Integer, Employe>> result=employe.entrySet();
				Iterator<Entry<Integer,Employe>> itr=result.iterator();
				
				while(itr.hasNext()) {
					Entry<Integer,Employe> fr=itr.next();
					System.out.println(fr.getKey()+"  "+fr.getValue());
				}
				
				break;
			default:
				System.out.println("Error!!!!!");
		}
		
		
		}
		
	}

}
