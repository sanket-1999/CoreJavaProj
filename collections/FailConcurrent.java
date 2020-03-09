package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailConcurrent implements Runnable {

	Thread t1, t2;

	public FailConcurrent() {
		t1 = new Thread(this);
		t2 = new Thread(this);
		t1.setName("add");
		t2.setName("iterate");
		t1.start();
		t2.start();
	}

	public static CopyOnWriteArrayList<String> alist = new CopyOnWriteArrayList<String>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FailConcurrent();
	}

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		if (currentThread.getName().equals("add")) {
			alist.add("ad");
			try {
				t1.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			alist.add("def");
			try {
				t1.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			alist.add("def");
			try {
				t1.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			alist.add("def");
			try {
				t1.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			alist.add("def");
			try {
				t1.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} else if (currentThread.getName().equals("iterate")) {
			
				
				Iterator<String> itr = alist.iterator();
				while (itr.hasNext()) {
					String name = itr.next();
					System.out.println(name);
					
					try {
						t2.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			
				
			
			
		}

	}
}