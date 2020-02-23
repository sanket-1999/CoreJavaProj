package com.annotations;

enum Status {
	NEW(20), REJECTED(30), ACCEPTED(40), COMPLETED(50);

	int value;

	Status(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		switch (this) {
		case NEW:
			return "toString() NEW " + value; 
		case REJECTED:
			return "toString() REJECTED " + value;
		case ACCEPTED:
			return "toString() ACCEPTED " + value;
		case COMPLETED:
			return "toString() COMPLETED " + value;
		default:
			return "Invalid status!!";
		}
	}
};

class Order {
	private int order_id;
	private String name;
	private int quantity;
	private int price;

	public Order(int order_id, String name, int quantity, int price) {
		this.order_id = order_id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getOrderId() {
		return this.order_id;
	}

	public String getName() {
		return this.name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public int getPrice() {
		return this.price;
	}

	public void setOrderId() {
		this.order_id = order_id;
	}

	public void setName() {
		this.name = name;
	}

	public void setQuantity() {
		this.quantity = quantity;
	}

	public void setPrice() {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order id= " + this.order_id + " Name= " + this.name + " Quantity=  " + this.quantity + " Price=  "
				+ this.price;
	}

}

public class Orderenum {
	public static void main(String args[]) {
		Order o = new Order(1, "Sanket", 11, 11);
		Status s = Status.REJECTED;
		System.out.println(o);
		System.out.println("New value = " + s.getValue());
	}
}
