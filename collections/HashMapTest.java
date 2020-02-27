
package com.collections;

import java.util.*;

class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	 public int hashCode() {
		
		 return 20;
	    }

	
	 public boolean equals(Object d) {
			Date dob = (Date) d;
			if (this.day==dob.day && this.month==dob.month)
				return false;
			else
				return true;
	 }
	

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Date, String> hashMap = new HashMap<Date, String>();
		hashMap.put(new Date(24, 03, 1998), "Abc");
		hashMap.put(new Date(24, 03, 1999), "Xyz");
		hashMap.put(new Date(13, 10, 2000), "Pqr");

	/*	Iterator<Date> itr = hashMap.keySet().iterator();
		while (itr.hasNext()) {
			String name = itr.next().toString();
			System.out.println(name);
		} */
		
		String name = hashMap.get(new Date(13, 10, 2000));
		System.out.println(name);
	}

}