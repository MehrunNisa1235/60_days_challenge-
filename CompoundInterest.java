import java.util.*;
public class CompoundInterest
{
  public static void main(String args[])
  {
   double p,r,t,comp_int;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the principal amount"); 
           p=sc.nextDouble();
   System.out.println("enter the Rate"); 
           r=sc.nextDouble();
   System.out.println("enter the Time"); 
           t=sc.nextDouble();
   comp_int=p*(Math.pow((1+r/100),t)); 
   System.out.println("the compound interest is = " +comp_int); 
  }
}