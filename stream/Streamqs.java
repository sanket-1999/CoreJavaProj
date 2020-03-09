package com.stream;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Fruit {
	public String name;
	public int calories;
	public int price;
	public String color;

	public Fruit() {
	}

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + " ] ";
	}

}

class News {
	public int newsId;
	public String postedByUser;
	public String commentByUser;
	public String comment;

	public News() {
	}

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "] ";
	}

}

class Trader {
	public String name;
	public String city;

	public Trader() {
	}

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}

}

class Transaction {

	public Trader trader;
	public int year;
	public int value;

	public Transaction() {
	}

	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

}

class TestData {

	public static List<Fruit> getAllFruits() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Peach", 90, 50, "Red"));
		fruits.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruits.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruits.add(new Fruit("Apple", 300, 150, "Red"));
		fruits.add(new Fruit("Watermelon", 30, 20, "Red"));
		return fruits;
	}

	public static void printFruits(List<Fruit> fruits) {
		fruits.stream().forEach(System.out::println);
	}

	public static List<News> getAllNews() {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "Tom", "Anand", "Very nice article on budget"));
		newsList.add(new News(2, "Ivan", "Bipin", "Good budget description"));
		newsList.add(new News(1, "Tom", "Narang", "How can you write such an article?"));
		newsList.add(new News(2, "Jerry", "Mitul", "I agree with you!!"));
		newsList.add(new News(2, "James", "Anand", "This seems to be paid news for glorifying the budget"));
		newsList.add(new News(3, "Sara", "Daji", "Good article"));
		return newsList;
	}

	public static void printNews(List<News> newsList) {
		newsList.stream().forEach(System.out::println);
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Anand", "Pune"), 2016, 10000));
		transactions.add(new Transaction(new Trader("Neeraja", "Indore"), 2015, 25000));
		transactions.add(new Transaction(new Trader("Yog", "Mumbai"), 2011, 33000));
		transactions.add(new Transaction(new Trader("Lokesh", "Nagpur"), 2016, 200000));
		transactions.add(new Transaction(new Trader("Komal", "Pune"), 2011, 80000));
		transactions.add(new Transaction(new Trader("Ishwar", "Indore"), 2016, 12000));
		return transactions;
	}

	public static void printTransactions(List<Transaction> transactions) {
		transactions.stream().forEach(System.out::println);
	}
}

public class Streamqs {

	private static List<Fruit> fruits = TestData.getAllFruits();
	private static List<News> newsList = TestData.getAllNews();
	private static List<Transaction> transactions = TestData.getAllTransactions();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		fruits.stream().filter((Fruit f) -> f.calories < 100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed()).forEach(System.out::println);

		System.out.println("\n");

		System.out.println("2");
		fruits.stream().collect(Collectors.groupingBy(Fruit::getColor)).entrySet().forEach(System.out::println);

		System.out.println("\n");

		System.out.println("3");
		fruits.stream().filter((Fruit fruit) -> fruit.getColor().equalsIgnoreCase("Red"))
				.sorted(Comparator.comparing(Fruit::getPrice)).forEach(System.out::println);
		System.out.println("\n");

		System.out.println("4");
		Entry<Integer, Long> mapNewsComments = newsList.stream()
				.collect(Collectors.groupingBy(News::getNewsId, Collectors.counting())).entrySet().stream()
				.max(Comparator.comparing(Entry::getValue)).get();
		System.out.println("News Id: " + mapNewsComments.getKey() + " has maximum number of comments i.e. "
				+ mapNewsComments.getValue());
		System.out.println("\n");

		System.out.println("5");
		int newsCountForWordBudget = newsList.stream().mapToInt((News news) -> {
			int i = 0;
			Pattern p = Pattern.compile("budget");
			Matcher m = p.matcher(news.getComment());
			while (m.find()) {
				i++;
			}
			return i;
		}).sum();
		System.out.println("Word 'budget' has appeared " + newsCountForWordBudget + " times in comments");
		System.out.println("\n");

		System.out.println("6");
		Map<String, Long> mapCommentByUser = newsList.stream()
				.collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		System.out.println("commentByUser wise number of comments: " + mapCommentByUser);
		System.out.println("\n");

		System.out.println("7");
		List<Transaction> filtered = transactions.stream()
				.filter((Transaction transaction) -> transaction.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		System.out.println("Transactions in the year 2011 sorted by their value: " + filtered);
		System.out.println("\n");

		System.out.println("8");
		List<String> traderCities = transactions.stream()
				.map((Transaction transaction) -> transaction.getTrader().getCity()).distinct()
				.collect(Collectors.toList());
		System.out.println("Traders work in cities: " + traderCities);
		System.out.println("\n");

		System.out.println("9");
		List<Trader> puneTraders = transactions.stream()
				.filter((Transaction transaction) -> transaction.getTrader().getCity().equals("Pune"))
				.sorted((Transaction t1, Transaction t2) -> t1.getTrader().getName()
						.compareTo(t2.getTrader().getName()))
				.map((Transaction transaction) -> transaction.getTrader()).collect(Collectors.toList());
		System.out.println("Traders in Pune: " + puneTraders);
		System.out.println("\n");

		System.out.println("10");
		String traderNames = transactions.stream().map((Transaction transaction) -> transaction.getTrader().getName())
				.sorted().collect(Collectors.joining(","));
		System.out.println("Trader names: " + traderNames);
		System.out.println("\n");

		System.out.println("11");
		Optional<Transaction> opTransaction = transactions.stream()
				.filter((Transaction transaction) -> transaction.getTrader().getCity().equals("Indore")).findAny();
		System.out.println("Are any traders based in Indore? " + opTransaction.isPresent());
		System.out.println("\n");

		System.out.println("12");
		List<Integer> transactionValues = transactions.stream()
				.filter((Transaction transaction) -> transaction.getTrader().getCity().equals("Delhi"))
				.map((Transaction transaction) -> transaction.getValue()).collect(Collectors.toList());
		System.out.println("Transaction values from the traders living in Delhi: " + transactionValues);
		System.out.println("\n");

		System.out.println("13");
		Optional<Integer> opMaxTransactionValue = transactions.stream()
				.map((Transaction transaction) -> transaction.getValue()).reduce(Integer::max);
		System.out.println("Max transaction value: " + opMaxTransactionValue.get());
		System.out.println("\n");

		System.out.println("14");
		Optional<Integer> opMinTransactionValue = transactions.stream()
				.map((Transaction transaction) -> transaction.getValue()).reduce(Integer::min);
		System.out.println("Min transaction value: " + opMinTransactionValue.get());
		System.out.println("\n");

		System.out.println("15");
		Entry<String, Long> mapUserComments = newsList.stream()
				.collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting())).entrySet().stream()
				.max(Comparator.comparing(Entry::getValue)).get();
		System.out.println("User: " + mapUserComments.getKey() + " has maximum number of comments i.e. "
				+ mapUserComments.getValue());
		System.out.println("\n");

	}
}
