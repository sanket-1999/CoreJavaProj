package com.abstractclass;

abstract class Shape
{
abstract void draw();


}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle is created");
		
	}
}

class Cube extends Shape
{
	void draw()
	{
		System.out.println("Cube is created");
		
	}
}

class Shaperun
{
	
	public static void create(Shape ss[])
	{
		for(int i=0 ; i < ss.length ; i++)
			ss[i].draw();
	}
	
	public static void main (String args[])
	{
		Shape s[]=new Shape[2];
		s[0]=new Rectangle();
		s[1]=new Cube();
		Shaperun.create(s);
		
	}	
}
