package com.stream;

import java.util.ArrayList;
import java.util.List;

public class first {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("abcd");
		alist.add("def");
		alist.add("dede");
		
		 
		
		alist.stream().filter((String name)-> name.startsWith("d")).sorted().forEach(System.out::println);
		
	
		
	}

}
