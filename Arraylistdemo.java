package com.collection;

import java.util.Vector;

public class Arraylistdemo {
	
	public static void main(String[] args) {
		
		//ArrayList al=new ArrayList();
		//LinkedLIst al=new LinkedList
		Vector al=new Vector();
		//Stack al=new Stack();
		
		System.out.println("initial size " +al.size());
		System.out.println("initial capacity "+al.capacity());
		
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
		
		System.out.println("final size " +al.size());
		System.out.println("final capacity "+al.capacity());
		
	}

}
