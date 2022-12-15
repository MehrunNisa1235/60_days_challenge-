import java.util.*; 
class SwitchPro2
{
 public static void main(String args[])
   
   {   
       
      int choice,x,y,sum; 
         System.out.println("1: Addition"); 
         System.out.println("2: Even Odd");
         System.out.println("3: Natural no");
 
     System.out.println("enter case no");
        Scanner s=new Scanner(System.in); 
                choice=s.nextInt(); 

      switch(choice) 
      {
         case 1: 
              System.out.println("enter any number"); 
                x=s.nextInt(); 
                y=s.nextInt(); 
               sum=x+y;
             System.out.println("Sum of the no is = " +sum); 
                   break;  

         case 2: 
              System.out.println("enter the value");
               x=s.nextInt(); 
              if(x%2==0)
                System.out.println("Even");
              else
                System.out.println("Odd");
		   break; 

         case 3:  
                int n; 
              System.out.println("enter no");
               n=s.nextInt(); 
              for(int i=1;i<=n;i++)
                 System.out.println("Natural no is =" +i);
	           break; 
        default:
             System.out.println("wrong choice"); 

      }
    
    }  
 
}