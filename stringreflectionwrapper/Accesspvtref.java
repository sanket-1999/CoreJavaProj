package com.stringreflectionwrapper;
import java.lang.reflect.*; 

class Check { 
  
	
    private void pvtmethod() 
    { 
	  System.out.println("Private Method " ); 
    } 


} 
  
public class Accesspvtref { 
  
    public static void main(String[] args)     throws Exception 
    { 
    Check c = new Check(); 
	Method m = Check.class.getDeclaredMethod("pvtmethod"); 
	m.setAccessible(true); 
	m.invoke(c); 
	
	
	
    } 
} 