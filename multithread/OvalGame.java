package com.multithread;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class OvalGame extends Frame {

	int y1 = 400;
	int y2 = 400;
	int y3 = 400;

	public OvalGame() {
		super("Oval game");
		setBackground(Color.BLACK);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	class A implements Runnable {

		Thread t1, t2, t3;

		A() {
			t1 = new Thread(this);
			t2 = new Thread(this);
			t3 = new Thread(this);
			t1.setName("1st");
			t2.setName("2nd");
			t3.setName("3rd");
			t1.start();
			t2.start();
			t3.start();

		}

		@Override
		public void run() {

			Thread currentThread = Thread.currentThread();

			if (currentThread.getName().equals("1st")) {
				while (true) {
					int i;
					for (i = 0; i < 360; i++) {
						y1 = y1 - 1;
						try {
							t1.sleep(2);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();

					}
					for (i = 0; i < 360; i++) {
						y1 = y1 + 1;
						try {
							t1.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						repaint();

					}
				}
			} else if (currentThread.getName().equals("2nd")) {
				while (true) {
					int i;
					for (i = 0; i < 360; i++) {
						y2 = y2 - 1;
						try {
							t2.sleep(2);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();

					}
					for (i = 0; i < 360; i++) {
						y2 = y2 + 1;
						try {
							t2.sleep(4);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						repaint();

					}
				}
			} else if (currentThread.getName().equals("3rd")) {
				while (true) {
					int i;
					for (i = 0; i < 360; i++) {
						y3 = y3 - 1;
						try {
							t3.sleep(6);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();

					}
					for (i = 0; i < 360; i++) {
						y3 = y3 + 1;
						try {
							t3.sleep(6);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						repaint();

					}
				}
			}

		}
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) {
		Frame mf = new OvalGame();
		mf.setSize(500, 500);
		mf.setVisible(true);

		OvalGame o = new OvalGame();
		OvalGame.A in = o.new A();

	}
}
