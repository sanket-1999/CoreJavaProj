
package com.generics;

import java.util.*;

public class Ques3 {

	public static void printMapKeyValues(Map<? extends Number, ?> hm) {
		Iterator print = hm.entrySet().iterator();
		while (print.hasNext()) {
			Map.Entry r = (Map.Entry) print.next();

			System.out.println("" + r.getValue() + "" + r.getKey());
		}

	}

	public static void main(String[] args) {
		Map<Double, String> hmap = new HashMap<Double, String>();
		Map<Integer, Double> hmap1 = new HashMap<Integer, Double>();
		hmap.put(2.3, "sdsdsd");

		printMapKeyValues(hmap);
		System.out.println();

		hmap1.put(1, 23.4);

		printMapKeyValues(hmap1);

	}

}