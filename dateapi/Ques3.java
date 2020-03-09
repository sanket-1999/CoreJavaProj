package com.dateapi;

import java.time.LocalDate;
import java.time.Period;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class Leap implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temp) {
		int y = ((LocalDate) temp).getYear();

		LocalDate dt1 = (LocalDate) temp;
		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))

		{
			Period p = Period.between(dt1, LocalDate.of(y, 2, 29));
			if (p.getDays() < 0) {

				int yy = y + 4;
				if (((yy % 4 == 0) && (yy % 100 != 0)) || (yy % 400 == 0))

				{
					Period p1 = Period.between(dt1, LocalDate.of(yy, 2, 29));
					// System.out.println(p1);
					p = p1;
				}

			}

			System.out.println(p);
		} else {
			for (int i = 1; i <= 4; i++) {
				int yy = y + i;
				if (((yy % 4 == 0) && (yy % 100 != 0)) || (yy % 400 == 0))

				{
					Period p = Period.between(dt1, LocalDate.of(yy, 2, 29));
					System.out.println("Next 29th february in :\t" + p);
				}

			}
		}
		return temp;

	}

}

public class Ques3 {

	public static void main(String[] args) {

		LocalDate dt = LocalDate.of(2025, 2, 28);
//System.out.println(newdate);

		Temporal newdate = new Leap().adjustInto(dt);

	}

}
