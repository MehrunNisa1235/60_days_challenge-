import java.util.*; 
class StarPattern6
{ 
 public static void main(String args[]) 
 {  
    int n,m;  
    System.out.println("enter length");  
    Scanner s=new Scanner(System.in);  
            n=s.nextInt();  
    System.out.println("enter bredth");
            m=s.nextInt();  
    for(int i=1;i<=n;i++)   
     {
       for(int j=1;j<=m;j++)
       { 
	if(i==1||j==1||i==n||j==m)
         {
         System.out.print("*");   
         }
      else 
         {
         System.out.print(" "); 
         } 
        
      System.out.println();      
    } 
   }
  }
}