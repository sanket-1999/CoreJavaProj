package com.dateapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime = LocalTime.now();
		LocalTime noon = LocalTime.of(12, 0, 0);
		Duration duration = Duration.between(currentTime, noon);
		Duration requiredDuration = null;

		
		
		if (duration.getSeconds() < 0) { // 12PM already passed
			LocalTime night12AM = LocalTime.of(23, 59);
			Duration tempDuration = Duration.between(currentTime, night12AM);
			requiredDuration = tempDuration.plus(Duration.ofHours(12));
			requiredDuration = requiredDuration.plus(Duration.ofMinutes(1));
		} else if (duration.getSeconds() > 0) { // Current time before 12PM
			requiredDuration = duration;
		} else { // Current time is 12PM itself
			requiredDuration = Duration.ofSeconds(0);
		}
		System.out.println("requiredDuration = " + requiredDuration);

	}

}
