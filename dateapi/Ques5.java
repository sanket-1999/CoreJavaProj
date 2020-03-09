package com.dateapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter italian=
				DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);	
		
		LocalDate dt=LocalDate.now();
		String formatted = dt.format(italian);
		
		System.out.println("Locale of Italian: \t"+formatted);
		
		
		DateTimeFormatter germany=
				DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMAN);	
		
		LocalDate dt1=LocalDate.now();
		String formatted1 = dt1.format(germany);
		
		System.out.println("Locale of Germany: \t"+formatted1);
		
		
		DateTimeFormatter jap=
				DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.JAPANESE);	
		
		LocalDate dt2=LocalDate.now();
		String formatted2 = dt2.format(jap);
		
		System.out.println("Locale of Japan: \t"+formatted2);
		
		
		DateTimeFormatter fre=
				DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.FRANCE);	
		
		LocalDate dt3=LocalDate.now();
		String formatted3 = dt3.format(fre);
		
		System.out.println("Locale of France: \t"+formatted3);
		
		
	}

}
