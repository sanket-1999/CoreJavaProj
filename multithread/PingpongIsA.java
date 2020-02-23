package com.multithread;

public class PingpongIsA extends Thread {

	public PingpongIsA(String threadName) {
		super.setName(threadName);
		super.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new PingpongIsA("ping");
		new PingpongIsA("pong");
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
