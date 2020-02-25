package com.filehandling;

import java.io.*;

public class Readcontents {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fin1 = new FileInputStream("f://ibm/read.txt");
		FileInputStream fin2 = new FileInputStream("f://ibm/write.txt");
		FileInputStream fin3 = new FileInputStream("f://ibm/test.txt");

		SequenceInputStream si = new SequenceInputStream(fin1, fin3);
		SequenceInputStream sis = new SequenceInputStream(si, fin2);
		int i;
		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
		}
		sis.close();
		si.close();
		fin1.close();
		fin2.close();
		fin3.close();

	}

}
