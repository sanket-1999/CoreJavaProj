package com.dateapi;

import java.time.LocalDate;
import java.time.Period;

public class leapyear {
	public static void main(String args[]) {
		timeToReach29Feb();

		}
	
	 static void timeToReach29Feb() {
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int month = now.getMonth().getValue();
		if(year%4 == 0) { //Current year is leap year
			if(month == 1) { //January
				LocalDate _29FebDate = LocalDate.of(year, 2, 29);
				System.out.println(Period.between(now, _29FebDate));
			}
		}
		else { //Current year is NOT leap year
			int leapYear = year + (4 - year%4);
			LocalDate _29FebLeapDate = LocalDate.of(leapYear, 2, 29);
			System.out.println(Period.between(now, _29FebLeapDate));
		}
	}

	}
