package com.dateapi;

import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.next;
import java.time.DayOfWeek;

public class Ques7 {

	public static void main(String[] args) {
		LocalDate currentLocalDate = LocalDate.now();
		int year = currentLocalDate.getYear();
		currentLocalDate = LocalDate.parse(year + "-01-01");
		
	
		int count = 0;
		while (year == currentLocalDate.getYear()) {
			LocalDate nextSunday = currentLocalDate.with(next(DayOfWeek.SUNDAY));
			currentLocalDate = nextSunday;
			count++;
		}
		count = count--;
		System.out.println(count);
	}

}