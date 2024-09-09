package com.collection;

import java.util.ArrayList;

public class Arraylistatt {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(34);
		al.add("amshu");
		al.add("hello");
		al.add(45);
		al.add(null);
		al.add(true);
		al.add(false);
		al.add(34);
		al.add(65.22);
		al.add(2.22);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(45));
		System.out.println(al.isEmpty());
		System.out.println(al.get(2));
		System.out.println(al.indexOf(null));
		System.out.println(al.lastIndexOf(null));
		System.out.println(al.remove(0));
		System.out.println(al.get(0));
		
		
		ArrayList al1=new ArrayList();
		
		al1.add("good morning");
		al1.add(32);
		System.out.println(al1);
		
		al1.addAll(al);
		System.out.println(al1);
		
		al1.retainAll(al);
		System.out.println(al);
		
		
	}

}
