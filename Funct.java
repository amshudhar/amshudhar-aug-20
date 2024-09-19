package com.javanew;

import java.util.function.Function;

public class Funct {
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> fi= i-> i*i;
		System.out.println(fi.apply(12));
		System.out.println(fi.apply(18));
		System.out.println(fi.apply(7));
		System.out.println(fi.apply(9));
		System.out.println(fi.apply(6));
		
		Function<String,Integer> fs= str->str.length();
		System.out.println(fs.apply("hello"));
		System.out.println(fs.apply("sleeepy"));
		System.out.println(fs.apply("dev"));
		System.out.println(fs.apply("moprning"));
		
		Function<String,String> fds=str->str.toUpperCase();
		System.out.println(fds.apply("deva"));
		System.out.println(fds.apply("mannar"));
		System.out.println(fds.apply("varadha"));
		System.out.println(fds.apply("shourya"));
		
	}

}
