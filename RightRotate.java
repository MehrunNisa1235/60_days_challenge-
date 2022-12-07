import java.util.*; 
public class RightRotate
{
  public static void main(String args[]) 
  {
     int a[]={2,4,6,8,5,10,7}; 
        
     
     System.out.println("original array element is : "); 
     for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+" ");  
      } 
         System.out.println();
      int last_element=a[a.length-1]; 
      for(int j=a.length-1;j>=1;j--) 
     {
	a[j]=a[j-1];  
     }   
        a[0]=last_element;  
     System.out.println("after left rotation array element is :" );
      for(int i=0;i<a.length;i++)
      {
	System.out.print(a[i]+" "); 
      }  
  }
}