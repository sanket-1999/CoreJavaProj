package com.stringreflectionwrapper;

import java.lang.reflect.*;

class Check {

	private void method() {
		System.out.println("Private Method Invoked");
	}

}

public class Accesspvtref {

	public static void main(String[] args) throws Exception {

		Check c = new Check();
		Method m = Check.class.getDeclaredMethod("method");
		m.setAccessible(true);
		m.invoke(c);

	}
}