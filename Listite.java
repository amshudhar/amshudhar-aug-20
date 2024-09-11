package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Listite {
	
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
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			if(itr.next().contains("kalakeya")) {
				itr.remove();
			}
		}
		
		for(String e:al) {
			System.out.println(e);
		}
		
		
	}

}
