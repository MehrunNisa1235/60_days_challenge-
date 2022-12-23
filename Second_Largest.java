public class Second_Largest 
{
 public static void main(String args[])
 {
   int a[]={20,13,56,22,44,10,9,5}; 
   int n=a.length;
   //find second largest element 
    int temp=0;  
    for(int i=0;i<a.length;i++)
    { 
        int flag=0;
    for(int j=0;j<a.length-1-i;j++)
      { 
           
         if(a[j]>a[j+1])
         {
	   temp=a[j];
           a[j]=a[j+1];
           a[j+1]=temp;
           flag=flag+1;  
         }
      } 
      if(flag==0)
      {
         break; 
      } 
    }  
      
   System.out.print("second largest element is : " +a[n-2]); 
 }
}