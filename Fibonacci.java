import java.util.*; 
public class Fibonacci
{
 public static void main(String args[])
 {
   int a=0,b=1,n; 
   System.out.println("enter the number of terms"); 
   Scanner s=new Scanner(System.in); 
           n=s.nextInt(); 
   for(int i=0;i<n;i++)
   {
     System.out.print(a+" "); 
      int c=a+b;
      a=b;
      b=c; 
  }
 }
}