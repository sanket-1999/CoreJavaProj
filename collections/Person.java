package com.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

class Check implements Comparable<Check> {
	String name;
	int height, weight;

	Check(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;

	}

	@Override
	public int compareTo(Check c) {

		if (this.weight > c.weight) {
			return 1;
		} else if (this.weight < c.weight) {
			return -1;
		}

		else {
			if (this.height > c.height) {
				return 1;
			} else if (this.height < c.height) {
				return -1;
			}
		}
		return 0;

	}

	@Override
	public String toString() {
		return "Sorting : [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}

}

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Check> treeSet = new TreeSet<Check>();
		treeSet.add(new Check("john", 5, 50));
		treeSet.add(new Check("cena", 7, 70));
		treeSet.add(new Check("jon", 8, 80));
		treeSet.add(new Check("random", 9, 80));
		treeSet.add(new Check("abc",7,80));

		Iterator<Check> itr = treeSet.iterator();
		while (itr.hasNext()) {
			Check a = itr.next();
			System.out.println(a);
		}

	}

}
