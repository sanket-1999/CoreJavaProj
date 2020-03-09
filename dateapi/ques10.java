package com.dateapi;

import static java.time.temporal.TemporalAdjusters.dayOfWeekInMonth;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.next;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.List;

public class ques10 {

	public static void main(String args[]) {

		findTotalHolidaysDuringMonthYear();
	}

	static void findTotalHolidaysDuringMonthYear() {
		
		class NextHoliday implements TemporalAdjuster {

			@Override
			public Temporal adjustInto(Temporal temporal) {
				
				LocalDate local = LocalDate.from(temporal);
				if (local.equals(local.with(lastDayOfMonth()))) {
					return null;
				}
				if (local.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
					return local.plusDays(1);
				} 
				else {
					LocalDate firstDayOfMonthDate = LocalDate.of(local.getYear(), local.getMonthValue(), 1);
					LocalDate secondSaturdayDate = firstDayOfMonthDate.with(dayOfWeekInMonth(2, DayOfWeek.SATURDAY));
					LocalDate fourthSaturdayDate = firstDayOfMonthDate.with(dayOfWeekInMonth(4, DayOfWeek.SATURDAY));
					LocalDate saturdayDate = LocalDate.from(next(DayOfWeek.SATURDAY).adjustInto(local));
					if (saturdayDate.equals(secondSaturdayDate) || saturdayDate.equals(fourthSaturdayDate)) {
						LocalDate sundayDate = saturdayDate.with(next(DayOfWeek.SUNDAY));
						if (sundayDate.getMonthValue() == local.getMonthValue())
							return sundayDate;
						else
							return null;
					} else {
						return saturdayDate.getMonthValue() != local.getMonthValue() ? null : saturdayDate;
					}
				}
			}

		}
		int month = 11;
		int year = 2019;
		LocalDate mylist = LocalDate.of(year, month, 1);
		List<LocalDate> holidayList = new ArrayList<>();
		if (mylist.getDayOfWeek().equals(DayOfWeek.SATURDAY)
				|| mylist.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			holidayList.add(mylist);
		}

		while (mylist.getMonthValue() == month) {
			mylist = mylist.with(new NextHoliday());
			if (mylist == null)
				break;
			holidayList.add(mylist);
		}
		holidayList.stream().forEach(System.out::println);
	}
}
