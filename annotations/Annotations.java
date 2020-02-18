package com.annotations;
class  Xyz
{
	
	int x ;
	Xyz(int x)
	{
		this.x=x;
	}
	
	
	@Deprecated
	void test()
	{
		System.out.println("Testing");
	}
	

	
}


public class Annotations
{
	@SuppressWarnings({"deprecation"})
	public static void main (String args[])
	{
		
		Xyz x= new Xyz(5);
		x.test();
		System.out.println(x);
	}
}