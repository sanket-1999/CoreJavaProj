package com.classnobj;
class Data
{
	
		private int day,month,year;
	
		public Data()
		{
		day=10;
		month=10;
		year=2010; 
		}
		
		public Data(int day, int month , int year)
		{
		     this.day=day;
			 this.month=month;
			 this.year=year;
		
		}
		
		
		public void setDate(int day)
		{
			this.day=day;
		}
		public void setMonth(int month)
		{
			this.month=month;
		}
		public void setYear(int year)
		{
			this.year=year;
		}
		public int getDate()
		{
			
			return this.day;
		}
		public int getMonth()
		{
			
			return this.month;
		}
		
		public int getYear()
		{
			
			return this.year;
		}
		
		public void print()
		{
		System.out.println("Date = "+getDate());
		}
	
		
		public void swap(int x, int y)
		{
			System.out.println("Before swapping, x=" +x+"y="+y);
			
			x = x + y;
			y = x - y;
			x = x - y;
			System.out.println("After swapping, x=" +x +"y="+y);
		}

		public String toString() 
		{
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}
	}	

public class Date {
	
	public static void main(String args[])
	{
		
		Data d2 = new Data();
		d2.setDate(11);
		d2.setMonth(7);
		d2.setYear(2019);
		d2.print();
		System.out.println(d2);
		
		d2.swap(13,14);
		
	}
}	