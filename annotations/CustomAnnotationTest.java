package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
@interface Getter {
	String x() default "xyz";

	int a() default 2;
}

public class CustomAnnotationTest {
	int x;
	String y;

	@Getter
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}

	@Getter
	public String getY() {
		return y;
	}


	public void setY(String y) {
		this.y = y;
	}


	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) throws Exception {
		CustomAnnotationTest obj = new CustomAnnotationTest();
		obj.setX(7);
		obj.setY("Gourav");
		Class c = Class.forName("com.annotations.CustomAnnotationTest");
		Method m[] = c.getMethods();
		String t;
		for (int i = 0; i < m.length; i++) {
			String s;
			boolean isGetterMethod = false;

			Method myMethod = m[i];
			// System.out.println(myMethod.getName());
			Annotation annotation[] = myMethod.getAnnotations();
			for (int j = 0; j < annotation.length; j++) {
				if ((annotation[j].annotationType().getName()).equals("Getter")) {
					isGetterMethod = true;
				}
			}
			if (isGetterMethod) {
				// System.out.println(myMethod.getName());
				s = myMethod.getName();
				t = "get" + s.substring(3, s.length()).toLowerCase();
				// System.out.println(t);
				if (myMethod.getName().equals(t)) {
					System.out.println("Wrongs Used Getter Method " + myMethod.getName());
				}
			}
		}

	}

}
