// program of method overloading where no of argument are different:- 

public class Overloading
{
 int sum; 
 void add(int a)
 {
   sum=a+10; 
   System.out.println(sum); 
 }
 void add(int a,int b)
 {
   sum=a+b; 
   System.out.println(sum); 
 }
 void add(int a,int b,int c)
 {
  sum=a+b+c; 
  System.out.println(sum); 
 }

  public static void main(String args[])
  {
    Overloading o=new Overloading();
      
      o.add(10,30);
      o.add(10,20,30); 
      o.add(10);  
   }
} 
 