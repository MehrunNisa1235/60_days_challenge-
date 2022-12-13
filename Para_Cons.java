// program to perform parameterized constructor:- 

public class Para_Cons
{
 int x,y;
 Para_Cons(int a,int b)  // parameterized constructor
 {
   x=a;
   y=b;
 }
public void Para_Cons(int a,int b)  
 {
  x=a;
  y=b; 
 } 

public void assign()  
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
    Para_Cons ob=new Para_Cons(5,3);  
    ob.display(); 
    ob.Para_Cons(5,8);
    ob.display();  
    ob.assign();
    ob.display(); 
  }
} 