package com.multithread;

public class Pingpong extends Thread {

	public Pingpong(String threadName) {
		super.setName(threadName);
		super.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub;

		Runnable r1 = new Runnable() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("ping");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		};

		Runnable r2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("\t pong");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};
		Runnable r3 = new Runnable() {
			public void run() {
				for (;;) {
					System.out.println("\t\t tong");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();

	}

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		if (currentThread.getName().equals("ping")) {
			for (int i = 0; i < 20; i++) {
				System.out.println("ping");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		} else if (currentThread.getName().equals("pong")) {
			for (int i = 0; i < 20; i++) {
				System.out.println("\t pong");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
