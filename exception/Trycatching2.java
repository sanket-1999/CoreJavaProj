package com.exception;

public class Trycatching2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5, y = 1;
		try {

			int d = x / y;
			try {
				int arr[] = new int[5];
				arr[6] = 5;
			}

			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();

			}
		}

		catch (ArithmeticException e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Done");
		}

	}

}
