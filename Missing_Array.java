public class Missing_Array 
{
  public static void main(String args[]) 
  {
     int a[]={1,2,4,5};  
     int n,sum=0;
     
    System.out.println("original array element is : ");
     for(int i=0;i<a.length;i++) 
     {
	System.out.print(a[i]+" "); 
     }  
      System.out.println(); 

     n=a.length+1; 
     int exp_sum=(n*(n+1)/2); 
 
     for(int i=0;i<a.length;i++) 
     {
         sum=sum+a[i]; 
     }
     System.out.println("missing array element is : " +(exp_sum-sum)); 
  }
}