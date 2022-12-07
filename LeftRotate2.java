import java.util.*; 
public class LeftRotate2
{
  public static void main(String args[]) 
  {
     int a[]={5,4,2,8,9,1,6,9};  
     System.out.println("Array input is : ");  
     for(int i=0;i<a.length;i++)  
     {
	System.out.print(a[i]+" "); 
     }  
     System.out.println();  

     System.out.println("enter the index number u want to rotate : "); 
      Scanner sc=new Scanner(System.in); 
            int n=sc.nextInt(); 

     for(int i=0;i<n;i++)
      {
	int first=a[0]; 
	for(int j=0;j<a.length-1;j++)
	{
	    a[j]=a[j+1]; 
	} 
         a[a.length-1]=first; 
      }  
      
      System.out.println("After rotation Array is : ");  
     for(int i=0;i<a.length;i++)  
     {
	System.out.print(a[i]+" "); 
     }  
     
  }
}