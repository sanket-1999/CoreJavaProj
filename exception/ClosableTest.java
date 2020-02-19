package com.exception;


	interface AutoClosable
	{
	public void close()throws Exception;
	
	}

	class MyAutoClosable implements AutoCloseable {

		public void close() throws Exception
		{
			System.out.println("MyAutoClosable ended");
		}
	}

public class ClosableTest {

	public static void main(String[] args) throws Exception  {
		
		try(MyAutoClosable m1=new MyAutoClosable())
		{
			
			System.out.println("inside try");
			
		}
			}

	}




