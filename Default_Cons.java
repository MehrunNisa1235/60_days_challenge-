// program to perform default  constructor:- 

public class Default_Cons
{
 int x,y;
 
public void Default_Cons()  //default constructor
 {
  x=20;
  y=10; 
 }
public void display()
 { 
  int sum; 
  sum=x+y; 
  System.out.println("sum is = " +sum); 
 }

public static void main(String args[])
  {
    Default_Cons ob=new Default_Cons();  
    ob.Default_Cons(); 
    ob.display();   
  }
} 