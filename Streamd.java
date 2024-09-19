package com.javanew;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamd {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(23);
		al.add(84);
		al.add(47);
		al.add(76);
		al.add(82);
		al.add(19);
		al.add(23);
		al.add(32);
		
		System.out.println(al);
		
	 List<Integer> lal=	al.stream().filter(l->l%2==0)
			 			.collect(Collectors.toList());
	 System.out.println("even numbers are "+lal);
	 
	 List<Integer> mal=al.stream().map(i->i+5).collect(Collectors.toList());
	 System.out.println("increment by 5 "+mal);
	 
	 Long cal=al.stream().filter(i->i<40).count();
	 System.out.println("failed "+cal);
	 
	 List<Integer> sal= al.stream().sorted().collect(Collectors.toList());
	 System.out.println("sorted list "+sal);
	 
	 List<Integer> s1al=al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0)
			 				.collect(Collectors.toList());
	 System.out.println("the sorted list"+s1al);
	 
	 int minal=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
	 System.out.println("min value "+minal);
	 
	 int maxal=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
	 System.out.println("max value "+maxal);
	 
	 al.stream().forEach(System.out::println);
	 
		
	}

}


















