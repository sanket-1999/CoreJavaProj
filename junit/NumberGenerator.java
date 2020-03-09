package com.junit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class NumberGenerator {
	public  int getRandomNo() {
		
		Random ran = new Random();
		return ran.nextInt(100);
		
		
	}

}
