package com.classnobj;

class Customer {
	private int id;
	private String name;
	private double balance;

	public Customer(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public String toString() {
		return this.id + "" + this.name + "" + this.balance;
	}

}

class Fd extends Customer {
	private int fdamt;

	public Fd(int id, String name, int amount, int fdamt) {
		super(id, name, amount);
		this.fdamt = fdamt;

	}

	public double getBalance() {
		return super.getBalance() + this.fdamt;
	}

}

class Credit extends Customer {
	private int credit;

	public Credit(int id, String name, int amount, int credit) {
		super(id, name, amount);
		this.credit = credit;

	}

	public double getBalance() {
		return super.getBalance() + this.credit;
	}
}

public class Bank {
	public static double getTotalamt(Customer cs[]) {
		double total = 0.0;
		for (int i = 0; i < cs.length; i++) {
			total += cs[i].getBalance();
		}
		return total;
	}

	public static void main(String args[]) {

		Customer c[] = new Customer[2];
		c[0] = new Fd(1, "Abc", 20000, 2000);
		c[1] = new Credit(2, "Xyz", 4000, 1000);

		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}

		System.out.println("Total amount in bank =" + Bank.getTotalamt(c));

	}
}