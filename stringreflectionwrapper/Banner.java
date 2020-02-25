package com.stringreflectionwrapper;
import java.util.*;
class Banner
{
	/* public static void main(String args[]) throws Exception
	{
		StringBuilder sb= new StringBuilder("Welcome to Java");
		int n=sb.length();		
		for(int i=0;i<n;i++)
		{
			char ch=sb.charAt(i);
			System.out.print(ch);
			Thread.sleep(200);
		}
	} */
	
	
	public static void main(String args[]) throws Exception
	{
		StringBuilder s1=new StringBuilder("Welcome To Java ");
		for(int i=0;i<50;i++)
		{
		char c=s1.charAt(s1.length()-1);
		//s1=c+s1.substring(0,s1.length()-1);
		s1.insert(0,c);
		System.out.print(s1+"\r");
		s1.deleteCharAt(s1.length()-1);
		//StringBuilder s2=new StringBuilder(s1.substring(0,s1.length()-1) );
		//s1=s2;
		Thread.sleep(500);
		}
	}
}
		
