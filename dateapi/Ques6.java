package com.dateapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.now();
		String formatteddate = ld.format(formatter);

		System.out.println("d/m/y \t"+formatteddate);
		
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate ld1 = LocalDate.now();
		String formatteddate1 = ld1.format(formatter1);

		System.out.println("m/d/y \t"+formatteddate1);
		
		

	}

}
