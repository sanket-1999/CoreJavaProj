package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

class Op implements UnaryOperator<String> {
	public String apply(String str) {
		return str.toUpperCase();
	}
}

public class ConvertingUpperCase {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Abc");
		list.add("Abcd");
		System.out.println("Before: " + list);

		list.replaceAll(new Op());
		System.out.println("After: "+list);
	}

}
