package com.multithread;


public class PingpongHasA implements Runnable{

	Thread t1,t2;
	public PingpongHasA()
	{
		t1= new Thread(this);
		t2= new Thread(this);
		t1.setName("ping");
		t2.setName("pong");
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PingpongHasA();
	}
	
	@Override
	public void run() {
	Thread currentThread = Thread.currentThread();
	if(currentThread.getName().equals("ping"))
		{
			for (int i =0  ; i < 20 ; i++)
			{
				System.out.println("ping");
				try {
					Thread.sleep(500);
					} catch(InterruptedException e)
				{
				e.printStackTrace();
				}
			}
		}
	else if(currentThread.getName().equals("pong"))
	{
		for (int i =0  ; i < 20 ; i++)
		{
			System.out.println("\t pong");
			try {
				Thread.sleep(500);
				} catch(InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	}
	
	}
}	