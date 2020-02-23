package com.filehandling;

import java.io.*;

class Order implements Serializable {
	private int date;
	private String name;
	private static final long serialVersionUID= 1l;

	public Order(int date, String name) {
		super();
		this.date = date;
		this.name = name;
	}

	public int getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Order [date=" + date + ", name=" + name + "]";
	}

}

public class SerialDeserial {

	public static void main(String[] args) throws Exception {
		Order o = new Order(25, "abc");
		write(o);
		read();
	}

	public static void write(Order o) throws Exception {
		File file = new File("f://ibm//orders.dat");
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(o);
		out.flush();
		out.close();
	}

	public static void read() throws Exception {
		File file = new File("f://ibm//orders.dat");
		FileInputStream fin = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fin);
		Order order = (Order) in.readObject();
		System.out.println("Details = " + order);
	}
}
