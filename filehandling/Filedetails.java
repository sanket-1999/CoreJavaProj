package com.filehandling;

import java.io.*;
import java.util.ArrayList;

public class Filedetails {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("F://ibm");
		File[] list = f.listFiles();

		System.out.println("Files");
		for (File files : list) {
			if (files.isFile()) {
				System.out.println(files.getName());
				System.out.print("\t Read \t" + files.canRead());
				System.out.println("\t Write \t" + files.canWrite());
				System.out.println(files.length());
			}
		}

		System.out.println("Directory");
		for (File dirs : list) {
			if (dirs.isDirectory()) {
				System.out.println(dirs.getName());
				System.out.print("\t Read \t" + dirs.canRead());
				System.out.println("\t Write \t" + dirs.canWrite());

				;
			}
		}

	}
}
