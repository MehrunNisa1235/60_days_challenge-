import java.util.*;
public class LinearSearch
{
 public static void main(String args[])
 {
  System.out.println("enter the no. of element you want"); 
    Scanner sc=new Scanner(System.in); 
	 int n=sc.nextInt(); 

   int a[]=new int[n];
  System.out.println("enter the element:"); 
   for(int i=0;i<n;i++)
   {
	a[i]=sc.nextInt();
   }

   System.out.println("enter the item you want to search "); 
 	int item=sc.nextInt();
   
   int temp=0; 

   for(int i=0;i<n;i++)
   {
    if(a[i]==item)
    {
      System.out.println(item+" is present in " +i+ " index position"); 
       temp=temp+1; 
    } 
  }
  if(temp==0)
   {
       System.out.println("item not found in this list"); 
    } 
  }
}