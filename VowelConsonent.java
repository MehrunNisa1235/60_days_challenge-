import java.util.*;
public class VowelConsonent
{
  public static void main(String args[])
  {
     char ch;
    System.out.println("enter any alphabet");
    Scanner ob=new Scanner(System.in);
        ch=ob.next().charAt(0); 
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
       System.out.println("vowel");
    }
    else
    {
      System.out.println("consonant");
    }
  }
}