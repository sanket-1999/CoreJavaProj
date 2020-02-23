package com.classnobj;

class SampleSingletone {
	private static SampleSingletone ref = null;

	private SampleSingletone() {
	}

	public static SampleSingletone getInstance() {
		if (ref == null)
			ref = new SampleSingletone();
		return ref;
	}
}

public class Singletone {
	public static void main(String args[]) {
		SampleSingletone app = SampleSingletone.getInstance();
		SampleSingletone app1 = SampleSingletone.getInstance();
		System.out.println(app);
		System.out.println(app1);
	}
}