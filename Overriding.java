 class Maths 
{ 
  int n1,n2; 
  public int mathOperation(int a,int b)
  {
    n1=a; 
    n2=b; 
    return(n1+n2); 
  } 
}

 class multiplication extends Maths
 {
  public int mathOperation(int a,int b)
  {
    n1=a; 
    n2=b; 
    return(n1*n2); 
  } 
} 

public class Overriding
{
 public static void main(String args[])
 {
   multiplication ob=new multiplication(); 
   System.out.println(ob.mathOperation(3,4));
 }
} 
    
   
