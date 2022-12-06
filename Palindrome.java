 import java.util.*; 
public class Palindrome
{
 public static void main(String args[])
 { 
   int n,rev=0,rem,temp; 
   System.out.println("enter any number"); 
   Scanner s=new Scanner(System.in); 
           n=s.nextInt();  
   temp=n; 
   while(n>0)
   {
     rem=n%10;  
     n=n/10; 
     rev=rev*10+rem; 
   } 
   if(temp==rev)
   {
     System.out.println("palindrome"); 
   }
   else
    {
     System.out.println("not a palindrome");  
   }
 }
}