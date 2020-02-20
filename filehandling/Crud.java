package com.filehandling;
import java.io.*;

class Acc{
	private int id; 
	private double bal;
	
	Acc (int id , double bal)
	{
		this.id=id;
		this.bal=bal;
	}

	public int getId() {
	return id;
	}

	public double getBal() {
	return bal;
	}

	
	
}


public class Crud {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f= new File("F:\\IBM\\acc.txt");
		RandomAccessFile raf=new RandomAccessFile(f, "rw");
		Acc ac=new Acc(10,20000.0);
		
		
		raf.writeInt(ac.getId());
		raf.writeDouble(ac.getBal());
		
		raf.seek(0);
		int idd=raf.readInt();
		double ball=raf.readDouble();
		
		if(ball>10000.0)
		{
			System.out.println("Account id greater than 10000 : \t"+idd);
		}
		else
		{
			System.out.println("No account under 10000 balance");
		}
		
		
		
		raf.close();
		
		
	}

}
