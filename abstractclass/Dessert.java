package com.abstractclass;

import java.util.*;
abstract class DesertItem
{
int cost , data , data1;
int quantity =100;
abstract void getCost(int quantity);
abstract void setQuantity(int quantity);

}

 class Candy extends DesertItem
{

void  getCost(int quantity)
{
 if (quantity<this.quantity)
 {
int cost = 10;
System.out.println("cost 1 candy is ="+cost+"rs");
quantity=cost*quantity;
System.out.println("Total cost of total candy is ="+quantity+"rs");
 }
 else
 {
	 System.out.println("Order out of limit");
 }
}


void setQuantity(int data)
{
	System.out.println("Initial Quantity ="+quantity);	
quantity+=data;
System.out.println("Quantity after increasing is ="+quantity);
}
}

 
class Icecream extends DesertItem
{

void  getCost(int quantity)
{
	if(quantity<this.quantity) {
int cost =15;
System.out.println("cost 1 ice cream is ="+cost+"rs");
quantity=cost*quantity;
System.out.println("Total cost of ice cream is ="+quantity+"rs");
}

	else
	{
	
			 System.out.println("Order out of limit");
	}
	}
void setQuantity(int data)
{
	System.out.println("Initial Quantity ="+quantity);	
quantity+=data;
System.out.println("Quantity after increasing ="+quantity);
}
}



public class Dessert
{
	
	public static void owner(DesertItem di[])
	{
		System.out.println("Enter 1 for Candy , 2 for Icecream");
		Scanner sc1 = new Scanner(System.in);
		int ch2=sc1.nextInt();
		
		System.out.println("Enter quantity to buy");
		Scanner sc2 = new Scanner(System.in);
		int ch3=sc2.nextInt();
		
		if(ch2==1)
			di[0].getCost(ch3);
		if(ch2==2)
			di[1].getCost(ch3);
		
	}
	
	public static void customer(DesertItem de[])
	{
		System.out.println("Enter 1 for Candy , 2 for Icecream");
		Scanner sc4 = new Scanner(System.in);
		int ch4=sc4.nextInt();
		
		System.out.println("Enter quntity to increment");
		Scanner sc5 = new Scanner(System.in);
		int ch5=sc5.nextInt();
		
		if(ch4==1)
			de[0].setQuantity(ch5);
		if(ch4==2)
			de[1].setQuantity(ch5);
	}
	
	public static void main(String args[])
	{
		
		
		System.out.println("Enter 1 for Customer , 2 for owner");
		Scanner sc = new Scanner(System.in);
		int ch1=sc.nextInt();
		DesertItem d[]= new DesertItem[2];
		d[0]= new Candy();
		d[1]= new Icecream();
		if(ch1==1)
		Dessert.owner(d);
		if(ch1==2)
		Dessert.customer(d);
		
	}
	}
	