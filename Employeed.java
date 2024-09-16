package com.javanew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp{
	int eid;
	String ename;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
}

public class Employeed {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(new Emp(12,"gg"));
		al.add(new Emp(23,"ss"));
		al.add(new Emp(7,"dd"));
		al.add(new Emp(35,"nn"));
		
		System.out.println(al);
		
		Comparator<Emp> c=(e1,e2)->(e1.eid<e2.eid)?1:(e1.eid>e2.eid)?-1:0;
		
		Collections.sort(al,c);
		
		System.out.println(al);
		
	}

}
