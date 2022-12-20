 abstract class Shape
 {
    abstract void draw(); 
 }
  
 class Rectangle extends Shape
 {
   void draw() 
   {
    System.out.println("Drawing rectangle"); 
   }
 }

class Circle extends Shape
 {
  void draw() 
  {
   System.out.println("Drawing circle"); 
  } 
 } 

public class Abstraction_Pro
{
public static void main(String args[])
 {
    Shape s1=new Circle(); 
     s1.draw(); 
    Shape s2=new Rectangle(); 
     s2 .draw();    
 }
}