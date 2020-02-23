package com.filehandling;

import java.io.*;

import java.util.*;

class Account {
	private int account_no;
	private String name;
	private double balance;

	public Account(int account_no, String name, double balance) {
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNo() {
		return this.account_no;
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}
}

public class AccountTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account(12, "sanket", 10000);
		File file = new File("F:\\IBM\\acc.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeInt(ac.getAccountNo());
		dos.writeUTF(ac.getName());
		dos.writeDouble(ac.getBalance());

		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		int account_no = dis.readInt();
		System.out.println(account_no);
		String name = dis.readUTF();
		System.out.println(name);
		double balance = dis.readDouble();
		System.out.println(balance);
		dis.close();
		fis.close();

		dos.flush();
		fos.flush();
		dos.close();
		fos.close();

	}

}
