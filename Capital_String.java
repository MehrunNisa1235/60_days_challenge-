
// convert first letter of string in capital letter 

import java.util.*; 
public class Capital_String
{

  public static void main(String args[])
  {  
      
     String str=new String(); 
     System.out.println("enter string"); 
    Scanner sc=new Scanner(System.in); 
           str=sc.nextLine(); 
    char ch[]=str.toCharArray(); 
    ch[0]=(char)(ch[0]-32);  
    for(int i=1;i<ch.length-1;i++) 
   {
	if(ch[i]==' ') 
 	{
	   ch[i+1]=(char)(ch[i+1]-32); 
 	}
   }   
	String str1=""; 
	for(int i=0;i<ch.length;i++) 
        {
	 	str1=str1+ch[i]; 
	} 
    System.out.println(str1); 

  }
}