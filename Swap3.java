
//Swap of two number withour third variable: 
import java.util.*; 
public class Swap3
{
 public static void main(String args[])
 {
    int a,b; 
    System.out.println("enter a and b value"); 
    Scanner s=new Scanner(System.in); 
            a=s.nextInt(); 
            b=s.nextInt(); 
    System.out.println("before swapping a = "+a+" and b= " +b); 
     a=a*b; 
     b=a/b;  
     a=a/b;  
    System.out.println("after Swapping a= "+a+" and b=" +b); 
    
 }
}