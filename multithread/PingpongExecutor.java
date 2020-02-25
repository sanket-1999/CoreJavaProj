package com.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PingpongExecutor {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Runnable r1 = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("ping");
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable r2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("\t\tpong");
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};

		executor.execute(r1);
		executor.execute(r2);
		executor.shutdown();

	}
}