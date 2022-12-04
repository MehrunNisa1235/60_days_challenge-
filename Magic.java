import java.util.*;
class Magic
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter the any number");
    int n=sc.nextInt();
    int sum=0,a;
    for(int i=n;i>9;i=sum)
    {
       sum=0;
       for(int j=i;j>0;j=j/10)
       {
	 a=j%10;
         sum=sum+a; 
       }
   }
 if(sum==1)
  {
    System.out.println("this is a magic number"); 
   }
else
   {
    System.out.println("this is not a magic number"); 
   }
}
} 