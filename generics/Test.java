package com.generics;


class Generic<T>{
	private T t;
	
	
	public  void set(T t)
	{
		this.t=t;
	}
	
	public T get() {
		return t;
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic g= new Generic();
		g.set(12);
		System.out.println(g.get());
		
		
	}

}
