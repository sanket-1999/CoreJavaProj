package com.stringreflectionwrapper;

public class Commandline {
	public static void main(String args[]) {

		int arr[] = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}

		for (int i = 0; i < args.length; i++) {
			for (int j = i + 1; j < args.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted:");
		for (int i = 0; i < args.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
