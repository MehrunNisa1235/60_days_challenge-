import java.util.*;
public class BinarySearch
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
   
   int l=0;   			//lower index
   int h=n-1;  			//higher index
   int mid=(l+h)/2; 
   
   while(l<=h)
   {
     if(a[mid]==item) 
     {
       System.out.println("element is " +mid+ " index position");  
        	break; 
     }
    else if(a[mid]<=item)
     {
      	l=mid+1; 
     }
   else
    {
     	h=mid-1; 
    }
   mid=(l+h)/2;  
  } 
  if(l>h)
  {
    System.out.println("element not found in this list");  
  }
 }
}

