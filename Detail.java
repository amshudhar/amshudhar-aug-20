package com.collection;

import java.util.ArrayList;

public class Detail {
	
	public static void main(String[] args) {
		
		ArrayList<Employeearray> al=new ArrayList();
		
		al.add(new Employeearray("rana",128));
		al.add(new Employeearray("ram",148));
		al.add(new Employeearray("pk",138));
		al.add(new Employeearray("ntr",118));
		al.add(new Employeearray("arjun",168));
		
		System.out.println(al);
		
		for(Employeearray e:al) {
			if(e.getEmployeid()==128) {
				System.out.println(e);
			}
		}
		
		
		
	}

}
