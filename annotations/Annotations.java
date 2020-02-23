package com.annotations;

class Base
{
     public void display()
     {
         System.out.println("Base display()");
     }
}
class Annotations extends Base
{
     @Override
     public void display()
     {
         System.out.println("Annotations display");
     }
     public static void main(String args[])
     {
         Annotations obj = new Annotations();
         obj.display();
     }
}