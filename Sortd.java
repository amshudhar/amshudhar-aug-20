package com.javanew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class Compare implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer i1, Integer i2) {
//		if(i1<i2) {
//			return 1;
//		}else if(i1>i2){
//			return -1;
//		}
//		else {
//			return 0;
//		}
//	}
//}

public class Sortd {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(34);
		al.add(4);
		al.add(67);
		al.add(83);
		al.add(27);
		al.add(57);
		al.add(63);
		al.add(17);
		al.add(82);
		
		System.out.println(al);
		
//		Collections.sort(al,new Compare());
		
		Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>12)?1:0;
		
		Collections.sort(al,c);
		
		System.out.println(al);
		
	}

}
