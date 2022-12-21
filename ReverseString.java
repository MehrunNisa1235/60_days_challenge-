import java.util.*; 
public class ReverseString
{
 public static void main(String args[])
 { 
   String name; 
   int i,j,k; 
   System.out.println("enter String:"); 
   Scanner sc=new Scanner(System.in); 
       name=sc.nextLine(); 
   i=name.length()-1; 
  while(i>=0)
  {
    j=i; 
    while(name.charAt(j)!=' ' && j>0)
     j--; 
  if(j==0)
     k=0;
  else
     k=j+1; 
  System.out.print(name.substring(k,i+1)); 
  System.out.print(" "); 
     i=j-1; 
 }
  	
}
}