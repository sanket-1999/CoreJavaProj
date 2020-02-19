package com.filehandling;

import java.io.*;

public class Accountss {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		File file = new File("f://ibm//acc1.txt");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		int id=dis.readInt();
		String name= dis.readUTF();
		double balance= dis.readDouble();
		
		dis.close();
		fis.close();
		
		
		
		
	}

}
