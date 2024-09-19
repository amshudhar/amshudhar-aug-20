package com.javanew;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class Dteandtime {
	
	public static void main(String[] args) {
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		int yy=ld.getYear();
		int mm=ld.getMonthValue();
		int dd=ld.getDayOfMonth();
		System.out.println("date is "+yy+" "+mm+" "+dd);
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		int hh=lt.getHour();
		int min=lt.getMinute();
		int sec=lt.getSecond();
		int ns=lt.getNano();
		
		System.out.println("time is "+hh+" "+min+" "+sec+" "+ns);
		
		LocalDate bdy=LocalDate.of(2001, 12, 26);
		LocalDate tdy=LocalDate.now();
		
		Period p=Period.between(bdy, tdy);
		System.out.println(p.getYears()+" "+p.getMonths()+" "+p.getDays());
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int n=sc.nextInt();
		
		Year y=Year.of(n);
		if(y.isLeap()) {
			System.out.println("it is leap");
		}else {
			System.out.println("it is not a leap");
		}
		
		
	}

}
