import java.util.*; 
class StarPattern
{
  public static void main(String args[])
  { 
    int n; 
    System.out.println("enter any number"); 
    Scanner s=new Scanner(System.in); 
            n=s.nextInt(); 
    for(int i=1;i<=n;i++)
      {
       for(int j=1;j<=i;j++) 
        {
           System.out.print(" * "); 
        }  
      System.out.println("  "); 
      }  
  }
}