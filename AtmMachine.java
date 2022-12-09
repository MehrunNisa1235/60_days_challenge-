import java.util.*; 
public class AtmMachine
{
  public static void main(String args[])
  {
    int balance=35000; 
    Scanner sc=new Scanner(System.in); 
    while(true)
   { 
    System.out.println("welcome to State Bank Atm");
    System.out.println("choose 1 : for withdraw"); 
    System.out.println("choose 2 : for deposite");
    System.out.println("choose 3 : for check_balance");
    System.out.println("choose 4 : for exit");

    System.out.println("choose the operation what you want: "); 
    int n=sc.nextInt(); 
    switch(n)
    {
    case 1: 
        System.out.println("enter money to withdraw");  
            int withdraw=sc.nextInt(); 
        if(balance >=withdraw)
        {
	  balance=balance-withdraw; 
          System.out.println("please collect your money");
        } 
        else
        {
        System.out.println("Insufficient balance");
        }
        System.out.println("   ");
          break; 
    case 2:
        System.out.print("Enter money to be deposite : ");
         int deposite=sc.nextInt(); 
         balance=balance+deposite; 
       System.out.println("your money successfully deposited ");
       System.out.println(" ");
         break; 
    case 3:
       System.out.print("available balance is : " +balance);
       System.out.println(" ");
          break;
    case 4: 
      System.exit(0);
    default:
        System.out.println("Thanks for using ATM have a good day!!! "); 
           
    }
   


    }
  }
}