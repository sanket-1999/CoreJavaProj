package com.inheritancenpoly;
class Employee
{
	private int id;
	private String name;
	private double salary;
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public String toString()
	{
		return this.id+" "+this.name+" "+this.salary;
	}
}
class Manager extends Employee
{
	private double incentive;
	public Manager(int id,String name,double salary,double incentive)
	{
		super(id,name,salary);
		this.incentive=incentive;
	}
	public double getSalary()
	{
		return super.getSalary()+this.incentive;
	}
	public String toString()
	{
		return super.toString()+" "+this.incentive;
	} 
}
class Labour extends Employee
{
	private double over;
	public Labour(int id,String name,double salary,double over)
	{
		super(id,name,salary);
		this.over=over;
	}
	public double getSalary()
	{
		return super.getSalary()+this.over;
	}
	public String toString()
	{
		return super.toString()+" "+this.over;
	} 
}

public class EmployeeTest
{
	public static double getTotalSal(Employee emp[])
	{ 
	    double totalSal=0.0;
		for(int i=0;i<emp.length;i++)
		{
			totalSal+=emp[i].getSalary();
		}
		return totalSal;
	}
	public static void main(String args[])
	{
		Employee e[]=new Employee[2];
		e[0]=new Manager(1,"Abc",20000,2000);
		e[1]=new Labour(2,"Xyz",4000,1000);
		EmployeeTest.getTotalSal(e);
		
		for(int j=0 ; j<e.length ;j++)
		{
			System.out.println(e[j]);
		}
		
		System.out.println("Total salary = "+EmployeeTest.getTotalSal(e));
	}
		
}