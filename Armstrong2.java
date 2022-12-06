import java.util.*; 
public class Armstrong2
{
  public static void main(String args[])
  {
     int n,z,m,pro,sum=0,count=0,digit; 
     System.out.println("enter any number:"); 
     Scanner sc=new Scanner(System.in); 
             n=sc.nextInt(); 
  
    z=n; 
    while(z>0) 
    {
       digit=z%10; 
       count=count+1; 
          z=z/10; 
    } 
   z=n;	
   while(z>0)
   {
      digit=z%10; 
     pro=1;
     for(int i=1;i<=count;i++)
     {
        pro=pro*digit; 
     }
       sum=sum+pro; 
        z=z/10; 
   } 
    if(sum==n)
     {
 	System.out.println("number is Armstrong"); 
     }
   else
     {
        System.out.println("not an Armstrong number"); 
     }

  }
}