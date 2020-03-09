package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;


public class Ques8  extends Thread {

	
	
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ques8 q=new Ques8();
		 q.start();
			
	}

	@Override
		public void run() {
		// TODO Auto-generated method stub
		list.add(23);
		list.add(232);
		list.add(2332);
		
		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + "\n"));
		dispList.accept(list);
		
		
		}

}
