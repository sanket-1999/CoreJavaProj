package com.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("ABC");
		alist.add("PQR");
		alist.add("XYZ");

		ListIterator<String> i = alist.listIterator(alist.size());

		while(i.hasPrevious()){
		  System.out.println(i.previous());
		}

	}

}
