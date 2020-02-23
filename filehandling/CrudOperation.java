package com.filehandling;

import java.io.*;

class AccountOperation implements Serializable {
	private static final long serialVersionUID = 1l;
	private String name;
	private int account_no;
	private double balance;

	public AccountOperation() {
		super();
		this.name = name;
		this.account_no = account_no;
		this.balance = balance;
	}

	public AccountOperation(String name, int account_no, double balance) {
		super();
		this.name = name;
		this.account_no = account_no;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountOperation [name=" + name + ", account_no=" + account_no + ", balance=" + balance + "]";
	}
}

public class CrudOperation {
	public static AccountOperation printBalance(double bal) throws Exception {
		if (bal > 10000)
			System.out.println("Balance= " + bal);
		return null;
	}

	public static AccountOperation createAccount() throws Exception {
		File file = new File("F:\\ibm\\acc.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		AccountOperation ao = new AccountOperation("name", 123, 30000);
		raf.writeInt(ao.getAccount_no());
		raf.writeUTF(ao.getName());
		raf.writeDouble(ao.getBalance());
		System.out.println("AccountOperation:  name=" + ao.getName() + ", account_no=" + ao.getAccount_no()
				+ ", balance=" + ao.getBalance());
		System.out.println("Account created.....");
		raf.close();
		return null;
	}

	public static AccountOperation readAccount() throws Exception {
		File file = new File("F:\\ibm\\acc.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		long currentPosition = raf.getFilePointer();
		raf.seek(0);
		System.out.println();
		System.out.println("Reading created Account.....");
		int id = raf.readInt();
		System.out.println("AccountId= " + id);
		String name = raf.readUTF();
		System.out.println("Name= " + name);
		double balance = raf.readDouble();
		System.out.println("Balance = " + balance);
		System.out.println();
		raf.close();
		return null;
	}

	public static AccountOperation updateAccount() throws Exception {
		File file = new File("F:\\ibm\\acc.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		AccountOperation ao = new AccountOperation();
		long currentPosition = raf.getFilePointer();
		raf.seek(currentPosition++);
		ao.setAccount_no(1234);
		raf.writeInt(ao.getAccount_no());
		ao.setName("new");
		raf.writeUTF(ao.getName());
		ao.setBalance(122200.0);
		raf.writeDouble(ao.getBalance());
		System.out.println(ao.toString());
		raf.close();
		System.out.println();
		System.out.println(" Account Upadted...!!");
		return null;
	}

	public static AccountOperation deleteAccount() throws Exception {
		File file = new File("F:\\ibm\\acc.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		AccountOperation ao = new AccountOperation();
		long currentPosition = raf.getFilePointer();
		raf.seek(0);
		ao.setAccount_no(0);
		raf.writeInt(ao.getAccount_no());
		ao.setName("");
		raf.writeUTF(ao.getName());
		ao.setBalance(0.0);
		raf.writeDouble(ao.getBalance());
		System.out.println(ao.toString());
		raf.close();
		System.out.println();
		System.out.println("Account deleted....");
		raf.close();
		return null;

	}

	public static void main(String[] args) throws Exception {
		createAccount();
		readAccount();
		updateAccount();
		readAccount();
		deleteAccount();
		readAccount();
		System.out.println("Done");

	}

}
