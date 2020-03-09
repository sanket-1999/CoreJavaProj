package com.collections;

import java.util.HashMap;

class Test {
	private int x;

	public Test(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int hashCode() {

		return 10;
	}

	public boolean equals() {

		return false;

	}

}

public class Employeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Test, String> hashMap = new HashMap<Test, String>();
		hashMap.put(new Test(24), "Abc");
		hashMap.put(new Test(10), "xyz");

		String name = hashMap.get(new Test(24));
		System.out.println(name);

	}

}
