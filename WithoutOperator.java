import java.util.*;
public class WithoutOperator
{
  public static void main(String args[])
  {
    int num1,num2;
    System.out.println("enter the first number");
      Scanner ob=new Scanner(System.in);
            num1=ob.nextInt();
    System.out.println("Enter second number");
           num2=ob.nextInt();
    for(int i=1;i<=num2;i++)
    {
      num1++;
    }  
    System.out.println("sum is = " +num1); 
  }
}