import java.util.*; 
public class MatrixAddition 
{
 public static void main(String args[])
 {
    int row,col,i,j; 
    Scanner ob=new Scanner(System.in);
    System.out.println("enter the no of rows"); 
           row=ob.nextInt();  
     System.out.println("enter the no of col"); 
           col=ob.nextInt(); 

   int a[][]=new int[row][col]; 
   int b[][]=new int[row][col]; 
   int c[][]=new int[row][col];  
   System.out.println("Enter 1st matrix : "); 
   for(i=0;i<row;i++) 
    {
     for(j=0;j<col;j++) 
      a[i][j]=ob.nextInt(); 
    }
   System.out.println("Enter 2nd matrix : "); 
   for(i=0;i<row;i++) 
    {
     for(j=0;j<col;j++) 
      b[i][j]=ob.nextInt(); 
    }
   for(i=0;i<row;i++) 
    {
     for(j=0;j<col;j++) 
      c[i][j]=a[i][j]+b[i][j];  
    }  
  System.out.println("Addition of matrix is : "); 
   for(i=0;i<row;i++) 
    {
     for(j=0;j<col;j++) 
     {
        System.out.print(c[i][j] +" "); 
     }
       System.out.println(); 
    }
     
 }
}