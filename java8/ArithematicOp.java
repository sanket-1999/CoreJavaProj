package com.java8;

@FunctionalInterface
interface operation {
	int op(int a, int b);
}

public class ArithematicOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=2,y=3;
		
		
		operation add = (int a, int b) -> (a + b);
		System.out.println("Adding\t" + add.op(x, y));

		operation div = (a, b) -> (a / b);
		System.out.println("Dividing\t" + div.op(x, y));
		
		
		operation sub = (a, b) -> (a - b);
		System.out.println("Subtracting\t" + sub.op(x, y));
		
		operation mul = (a, b) -> (a * b);
		System.out.println("Multiplying\t" + mul.op(x, y));
		
	}

}
