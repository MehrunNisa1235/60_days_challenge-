import java.util.*; 
public class ShortString
{
  public static void main(String args[])
  { 
     String str=new String(); 
     System.out.println("enter String"); 
     Scanner sc=new Scanner(System.in); 
            str=sc.nextLine(); 
     int i=0; 
    for(i=str.length()-1;i>=0;i--)
    {
        if(str.charAt(i)==' ') 
	{
            break; 
	}
    }  
    String str1=str.substring(i+1,str.length()); 
    String str2=""; 
    str2=str2+str.charAt(0)+".";
    for(int j=1;j<i;j++)
    {
     if(str.charAt(j)==' ')
     {
	str2=str2+str.charAt(j+1)+"."; 
     }
    }
    str2=str2+str1;
    System.out.print(str2); 
    

  }
}