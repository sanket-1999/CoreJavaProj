package com.interfaceqs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class OrderHeightComparator implements Comparator<Order> {

	
	public int compare(Order p1, Order p2) {
		if(p1.height > p2.height) {
			return -1;
		}
		else if(p1.height < p2.height) {
			return 1;
		}
		return 0;
	}
}

class OrderWeightComparator implements Comparator<Order> {

	
	public int compare(Order p1, Order p2) {
		if(p1.weight > p2.weight) {
			return -1;
		}
		else if(p1.weight < p2.weight) {
			return 1;
		}
		return 0;
	}
}
class OrderNameComparator implements Comparator<Order> {
	public int compare(Order p1, Order p2) {
	return p1.name.compareTo(p2.name)*-1;
	}}
class Order implements Comparable<Order> 
{	String name;
	int height;
	int weight;
	public Order(String name, int height , int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String toString() {
		return name + " " + height + " " + weight;
	}
	public int compareTo(Order p) {
		if(this.height > p.height || this.weight > p.weight) {
			return -1;
		}
	else if(this.height < p.height || this.weight < p.weight) {
			return 1;
		}
		return 0;
	}
}
public class Person {

	public static void main(String args[]) {
		Order ord1 = new Order("Ankit", 5 , 20);
		Order ord2 = new Order("Jenie", 6 , 30);
		Order ord3 = new Order("xyz" , 7 , 30);
		List<Order> list = new ArrayList<Order>();
		list.add(ord1);
		list.add(ord2);
		list.add(ord3);
		Collections.sort(list, new OrderHeightComparator()); 
		for(Order ord: list) {
		System.out.println(ord);
		}
	}

}