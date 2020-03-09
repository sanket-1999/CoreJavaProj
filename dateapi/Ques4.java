package com.dateapi;

import java.time.LocalTime;
import java.time.ZoneId;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZoneId zoneid= ZoneId.of("Europe/Rome");
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
		
		LocalTime localTime = LocalTime.now(zoneid);
		LocalTime localTime1 = LocalTime.now(zoneid1);
		System.out.println("Current time in India :"+localTime1);
		System.out.println("Current time in Europe :"+localTime);
		
	}

}
