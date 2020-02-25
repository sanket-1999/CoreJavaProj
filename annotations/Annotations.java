package com.annotations;

interface Base {
	@Deprecated
	int x = 10;

	void print();
}

class Annotations implements Base {
	@Override
	public void print() {
		System.out.println("Overriden Print From Base");
	}

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		Base a = new Annotations();
		a.print();
		System.out.println(a.x);
	}
}
