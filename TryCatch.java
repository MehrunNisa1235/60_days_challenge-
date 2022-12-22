public class TryCatch
{
   public static void main(String []args)
    {
        int a=10,b=0,c;
       System.out.println("hlo guys ");
    try
    {
      c=a/b;
      System.out.println(c);
    }
   catch(ArithmeticException e)
   {
      System.out.println(e);
   }
   System.out.println("Rest of the code ");
    System.out.println("byyyy");
 }
}


