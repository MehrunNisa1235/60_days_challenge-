import java.util.*; 

public class Ascii
{
 public static void main(String args[])
  { 
     char ch;
     System.out.println("enter any character");
     Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0); 
    int asciivalue=ch;
    System.out.println("Ascii value of "+ch+" is " +asciivalue);
   
      
  }  
} 