package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Ques5 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("");
		Consumer<List<String>> modify = list -> {
			for (int i = 0; i < list.size(); i++) {

				sb.append(list.get(i).charAt(0));
			}
			System.out.println(sb);
		};

		//Consumer<List<String>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("efg");

		modify.accept(list);

		//dispList.accept(list);
	}
}