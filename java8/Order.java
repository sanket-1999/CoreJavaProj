package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface OrderPred {
	boolean test(Order t);
}

class OrderList {

	private static List<Order> orderList = new ArrayList<Order>();
	static {
		Random random = new Random();
		for (int i = 0; i < 40; i++) {
			String status = i % 2 == 0 ? "accepted" : "completed";
			int price = random.nextInt(150);
			Order order = new Order(price, status);
			orderList.add(order);
		}
	}

	public static List<Order> getOrders() {
		return orderList;
	}

	public static void printOrder(List<Order> order) {
		for (Order ord : order) {
			System.out.println(ord);
		}
	}

}

public class Order {

	private int price;
	private String status;

	public Order(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public String getStatus() {
		return status;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Orderss [price=" + price + ", status=" + status + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> orderlist = OrderList.getOrders();

		OrderPred bylocation = (Order t) -> "completed".equals(t.getStatus());
		OrderPred byprice = (Order t) -> t.getPrice() > 100;

		List<Order> filteredorder = filterOrders(orderlist, bylocation);

		List<Order> filteredorder1 = filterOrders(filteredorder, byprice);

		OrderList.printOrder(filteredorder1);

	}

	public static List<Order> filterOrders(List<Order> Orders, OrderPred predicate) {
		List<Order> filteredOrders = new ArrayList<Order>();
		for (Order Order : Orders) {
			if (predicate.test(Order)) {
				filteredOrders.add(Order);
			}
		}
		return filteredOrders;

	}

}
