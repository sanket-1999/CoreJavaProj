package com.annotations;
class Hospital
{
	void callback()
	{
		System.out.println("Alert high blood-pressure");
	}
	
	class Bloodpressure
	{
	int value;
	void Bloodpressure(int value)
	{
		this.value=value;
		
		if(this.value>140)
			callback();
	}
 }
}

public class Hospitalmanage
{
	
	public static void main(String args[])
	{
	Hospital ob1=new Hospital();
	Hospital.Bloodpressure ob=ob1.new Bloodpressure();
	ob.Bloodpressure(145);
	}
}