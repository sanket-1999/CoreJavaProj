package com.stringreflectionwrapper;
import java.util.*;
class Banner
{
	public static void main(String args[]) throws Exception
	{
		StringBuilder sb= new StringBuilder("Welcome to Java");
		int n=sb.length();		
		for(int i=0;i<n;i++)
		{
			char ch=sb.charAt(i);
			System.out.print(ch);
			Thread.sleep(200);
		}
	}
}