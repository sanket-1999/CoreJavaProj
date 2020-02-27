package com.collections;

import java.util.*;
import java.util.Map.Entry;

class User  {
	private String name;
	private String loginname;
	private String password;
	

	User() {

	}

	User(String loginname, String password) {
		this.loginname = loginname;
		this.password = password;
	}


}

public class Chatroom {

	public static Map<String, TreeSet<User>> hmapUsers = new HashMap<String, TreeSet<User>>();
	public static Map<String, List<String>> hmapMsgs = new HashMap<String, List<String>>();

	
	public static Map<String, String> hmsg= new HashMap<String, String>();
	public static void main(String[] args) {

		System.out.println("1: Create a chatroom");
		System.out.println("2: Add user");
		System.out.println("3: User Login");
		System.out.println("4: Send message");
		System.out.println("5: Display message");
		System.out.println("6: List users");
		System.out.println("7: Logout");
		System.out.println("8: Delete user");
		System.out.println("Enter choice");

		do {

			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();

			switch (x) {
			case 1:

				System.out.println("Enter chatroom name");
				String cname = sc.next();
				if (hmapUsers.containsKey(cname)) {
					System.out.println("already chatroom exists.");
				}

				else {
					hmapUsers.put(cname, new TreeSet<User>());
					hmapMsgs.put(cname, new ArrayList<String>());
					System.out.println("Created");
				}
				break;
			case 2:
				
				System.out.println("Add User");
				 hmapUsers.put(sc.next(),new TreeSet<User>());
				 hmapUsers.put(sc.next(),new TreeSet<User>());
				break;
			case 3:

				System.out.println("Enter username & password to login");
				String name1 = sc.next();
				String pass1 = sc.next();
				
				if(hmapUsers.containsKey(name1) && hmapUsers.containsKey(pass1))
				{
					System.out.println("logged in ");
				}
				
				else
				{
					System.out.println("failed");
				}
				break;
				
			case 4:
				System.out.println("enter chatroom you want to enter:");
				String chatroom=sc.next();
				if(hmapUsers.containsKey(chatroom))
				{
					System.out.println("enter message");
					String msg=sc.next();
					hmsg.put(chatroom, msg);
				}
				else
				{
					System.out.println("invalid chatroom.");
				}
				break;
				
				
			case 5:
				
				Collection<String> values = hmsg.values();
		        for (String v : values) {
		            System.out.println("Users: " + v);
		        } 
				
		        break;
			
			case 6:

				
				for (Map.Entry hmap : hmapUsers.entrySet())
				{
				    System.out.println("User: " + ((Entry) hmapUsers).getKey());
				}

				

			}

		} while (true);
	}

}
