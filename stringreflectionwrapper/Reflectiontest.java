package com.stringreflectionwrapper;

import java.lang.reflect.*;

class Reflectiontest {
	public static void main(String[] args) throws ClassNotFoundException {

		// import reflection package
		Class c = Class.forName("java.lang.String"); // loads the class forcefully into memory
		Constructor con[] = c.getDeclaredConstructors(); // returns all constructors of String class
		Method m[] = c.getDeclaredMethods(); // returns all methods of String class
		Field f[] = c.getDeclaredFields();

		for (int i = 0; i < con.length; i++) {
			System.out.println(con[i]);
		}

		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
	}

}