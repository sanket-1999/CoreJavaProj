package com.filehandling;

import java.io.*;

public class Readwrite {
	public static void main(String[] args) throws Exception {
		File file = new File("F:\\ibm\\read.txt");
		FileInputStream fis = new FileInputStream(file);
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		do {
			i = fis.read();
			if (i != -1)
				sb.append((char) i);
		} while (i != -1);
		System.out.println("Contents :" + sb);
		fis.close();

		String s = new String(sb);
		File file1 = new File("F:/ibm/write.txt");
		FileOutputStream fos = new FileOutputStream(file1);
		fos.write(s.getBytes());
		fos.flush();
		fos.close();

	}
}