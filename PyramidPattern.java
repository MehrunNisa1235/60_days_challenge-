import java.util.*; 
class PyramidPattern
{ 
 public static void main(String args[]) 
 {  
    int n;  
    System.out.println("enter any number");  
    Scanner s=new Scanner(System.in);  
            n=s.nextInt();   
    for(int i=1;i<=n;i++)   
     {
       for(int j=n;j>=i;j--)  
      {
        System.out.print("  ");    
      } 
      for(int k=1;k<=i;k++)  
      {
       System.out.print(" *");  
      }  
      for(int l=2;l<=i;l++)  
      {
        System.out.print(" *");    
      } 
      System.out.println();      
    }
  }
}