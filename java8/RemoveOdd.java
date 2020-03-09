package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class RemoveOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<List<String>> modify = alist -> {
			
				alist.removeIf(n -> (n.length() % 2 != 0));
			
			System.out.println(alist);
		};

		List<String> alist = new ArrayList<String>();
		alist.add("abcd");
		alist.add("acc");
		alist.add("eerer");
		alist.add("even");
		alist.add("aditya");

		modify.accept(alist);
	}

}
