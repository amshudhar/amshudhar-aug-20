package com.javanew;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Consu {
	
	public static void main(String[] args) {
		
		Consumer<String> c=cp->System.out.println(cp);
		
		c.accept("deva");
		c.accept("mannar");
		c.accept("shourya");
		c.accept("vara");
		
		
		Supplier<Date> d=()->new Date();
		System.out.println(d.get());
		
		Supplier<String> sp=()->{
			String otp="";
			for(int i=0;i<4;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(sp.get());
		
		
		
		
		
		
		
		
		
	}

}
