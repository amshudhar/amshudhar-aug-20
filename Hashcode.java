package com.collection;

import java.util.LinkedHashSet;

public class Hashcode {
	
	public static void main(String[] args) {
		
		//HashSet al=new HashSet();
		//TreeSet<String> al=new TreeSet<String>();
		LinkedHashSet al=new LinkedHashSet();
		
//		for(int i=0;i<10;i++) {
//			al.add(i);
//		}
		
		al.add("bahubali");
		al.add("devasena");
		al.add("mahismati");
		al.add("kattappa");
		al.add("kalakeya");
		al.add(null);
		al.add("movie");
		al.add("bahubali");
		
		System.out.println(al);
		
		
	}

}
