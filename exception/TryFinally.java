package com.exception;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[2];
		try {
			arr[3] = 3;
		}

		finally {
			System.out.println("Exception");
		}

	}

}
