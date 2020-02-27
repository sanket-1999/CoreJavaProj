package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetLinkedhashset {

	public static void main(String[] args) {

		Set<String> hset = new HashSet<String>();
		hset.add("ABC");
		hset.add("XYZ");
		hset.add("PQR");

		System.out.println("Hashset output :");
		Iterator<String> itr = hset.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}

		System.out.println("-----");
		LinkedHashSet<String> lset = new LinkedHashSet<String>();

		lset.add("ABC");
		lset.add("XYZ");
		lset.add("PQR");

		System.out.println("LinkedHashset output :");

		Iterator<String> i = lset.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
