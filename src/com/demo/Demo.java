package com.demo;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo {
	
	public static void demo() {
		ArrayList<Character> list = new ArrayList<Character>();
		HashSet<Character> set = new HashSet<Character>();
		
		String str = "Hello world we love java";
		char[] ch = str.replace(" ", "").toCharArray();
		
		for(int i = 0; i<ch.length; i++) {
			if(set.contains(ch[i])) {
				list.add(ch[i]);
			}
			else {
				set.add(ch[i]);
			}	
		}
		System.out.println("Duplicate letters are: "+list);	
		
	}
	
	
	
	public static void main(String[] args) {
		String s = "Hello all we invite";
		System.out.println();
	}

}
