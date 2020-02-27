package com.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("ABC");
		alist.add("PQR");
		alist.add("XYZ");

		for (int i = alist.size() - 1; i >= 0; i--) {
			System.out.println(alist.get(i));
		}

	}

}
