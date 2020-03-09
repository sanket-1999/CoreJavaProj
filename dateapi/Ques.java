package com.dateapi;

import java.time.LocalDate;



public class Ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println(""+currentDate);
		LocalDate dateAfter15Days = currentDate.plusDays(15);
		System.out.println("Date after 15 days: " + dateAfter15Days);
	

	
	}

}
