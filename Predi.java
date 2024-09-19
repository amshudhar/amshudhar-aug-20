package com.javanew;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predi {
	
	public static void main(String[] args) {
		
		Predicate<Integer> pi= i-> i%2==0;
		
		System.out.println(pi.test(45));
		System.out.println(pi.test(32));
		System.out.println(pi.test(36));
		System.out.println(pi.test(06));
		System.out.println(pi.test(20));
		System.out.println(pi.test(23));
		
		String name[]={"hello","worlds","gm","sleep"};
		
		Predicate<String> pd= s->s.length()>4;
		
		for(String sna:name) {
			if(pd.test(sna)) {
				System.out.println(sna);
			}
		}
		
		ArrayList<Stude> al=new ArrayList<Stude>();
		
		al.add(new Stude(10,"bad"));
		al.add(new Stude(20,"average"));
		al.add(new Stude(30,"good"));
		al.add(new Stude(50,"excellent"));
		
		Predicate<Stude> ps=i->i.sno>25;
		
		for(Stude sss:al) {
			if(ps.test(sss)) {
				System.out.println(sss.sna+" "+sss.sno);
			}
		}
		
		
		
		

		
	}

}
