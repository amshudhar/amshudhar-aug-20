package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iter {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("bahubali");
		al.add("devasena");
		al.add("mahismati");
		al.add("kattappa");
		al.add("kalakeya");
		al.add("movie");
		al.add("bahubali");
		
		System.out.println(al);
		
		ListIterator<String> it=al.listIterator();
		
		while(it.hasNext()) {
			if(it.next().contains("kattappa")) {
				it.set("ballala");
			}
		}
		
		for(String e:al) {
			System.out.println(e);
		}
		
		System.out.println("==========reverse order========");
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		
		
		
		
		
		
	}

}
