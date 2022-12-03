import java.util.*; 
public class Sum_Product
{
 public static void main(String args[])
 {
	int digit,sum=0,pro=1,n; 
     System.out.println("enter the number "); 
     Scanner sc=new Scanner(System.in); 
	     n=sc.nextInt();

   while(n>0)
   {
	digit=n%10;
       sum=sum+digit; 
       pro=pro* digit; 
         n=n/10; 

   }
   System.out.println("sum of the digit is = " +sum); 
   System.out.println("product of the digit is = " +pro);

 }
}