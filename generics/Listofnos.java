package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Listofnos {
	public static void process(List<? extends Number> list)
	{
		for (Object print: list)
			System.out.println(" "+print);
	}
	
	public static void main(String args[])
	{
		List<Integer>  list1= new ArrayList();
		list1.add(12);
		
		List<Float>  list2= new ArrayList();
		list2.add((float)12/5);
		
		
		
		process(list2);
		process(list1);
		
		
	}
}
