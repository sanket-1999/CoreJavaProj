package com.interfaceqs;
interface Printable {
	void print();
}

class Employee implements Printable
{
 public void print()
 {
	 System.out.println("Employee");
 }	 
}

class Circle implements Printable
{
 public void print()
 {
	 System.out.println("Circle");
 }	 
}

class Printinter 
{
	public static void printAll(Printable pi[])
	{
		for(int i =0 ; i <pi.length ; i ++)
		{
			pi[i].print();
		}
	}
	public static void main(String args[])
	{
		Printable  p[] = new Printable [2];
		p[0]= new Employee();
		p[1]= new Circle();
		Printinter.printAll(p);
	}
}