import java.util.*; 
public class PrimeAll 
{
 public static void main(String[] args)
 {
    int n1,n2,i,j; 
    Scanner s=new Scanner(System.in);
    System.out.println("enter first number");  
            n1=s.nextInt();
    System.out.println("enter second number");  
            n2=s.nextInt(); 
    for(i=n1;i<=n2;i++)
    { 
    for(j=2;j<=i;j++)
     {
       if(i%j==0)
       break; 
     } 
     if(i==j)
       System.out.println(j); 
   }
 }
}