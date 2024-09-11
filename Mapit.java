package com.collection;

import java.util.TreeMap;

public class Mapit {
	
	public static void main(String[] args) {
		
		//HashMap hp=new HashMap();
		//LinkedHashMap hp=new LinkedHashMap();
		TreeMap<Integer,String> hp=new TreeMap();
		
		hp.put(102, "bahu");
		hp.put(107, "deva");
		hp.put(104, "veer");
		hp.put(102, "balla");
		
//		hp.put("hello", "manna");
//		hp.put("well", "shourya");
//		hp.put("good", "cheta");
		
		System.out.println(hp);
		
	}

}
