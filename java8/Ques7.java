package com.java8;

import java.util.HashMap;
import java.util.Map;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<>();
		map.put("name1", "value1");
		map.put("name2", "value2");
		map.put("name3", "value3");
		map.put("name4", "value4");
		map.put("name5", "value5");

		StringBuilder builder = new StringBuilder("");
		for (Map.Entry<String, String> ent : map.entrySet()) {

			builder.append(ent.getKey()).append(" ");
			builder.append(ent.getValue()).append("\n");
		}
		System.out.println("Appending in one string \n" + builder);

	}

}
