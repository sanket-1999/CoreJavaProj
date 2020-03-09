package com.java8;
import java.util.function.*;
import java.util.*;


@FunctionalInterface
interface Predicate<T> {
	boolean test();
}

@FunctionalInterface
interface Consumer<T> {
	void accept(T t);
}

@FunctionalInterface
interface Supplier<T> {
	T get();
}

@FunctionalInterface
interface Function<T, R> {
	R apply(T t);
}

public class Ques3 {
	public static void printList(List<Integer> list) {
		for (Integer i : list) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(24);

		Predicate<List<Integer>> pr = () -> list.isEmpty();
		System.out.println(pr.test());

		Consumer<Integer> con = (Integer x) -> System.out.println(list);
		printList(list);

		Supplier<Integer> sup = () -> list.indexOf(24);
		System.out.println(sup.get());

		Function<Integer, String> fun = (Integer i) -> i > 22 ? "Greater" : "Lesser";
		System.out.println(fun.apply(list.get(1)));
	}
}

