package com.exception;

public class Trycatchtesting {

	public static void main(String[] args) {
		int x = 5, y = 0;
		try {
			int d = x / y;
		}

		catch (ArithmeticException e) {
			e.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Complete");

		}

	}

}
