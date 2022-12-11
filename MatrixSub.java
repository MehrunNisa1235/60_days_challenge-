import java.util.*; 
class MatrixSub
{
  public static void main(String args[])
  {
    int row,col,i,j; 
    Scanner sc=new Scanner(System.in); 
   
   System.out.println("enter the no of row"); 
     row=sc.nextInt(); 

   System.out.println("enter the no of columns"); 
     col=sc.nextInt();  
     
   int a[][]=new int[row][col];
   int b[][]=new int[row][col];
   int c[][]=new int[row][col]; 
   
   System.out.println("enter matrix1 element"); 
    for(i=0;i<row;i++)
    {
     for(j=0;j<col;j++) 
      a[i][j]=sc.nextInt(); 
    }
    
   System.out.println("enter matrix2 element"); 
    for(i=0;i<row;i++)
    {
     for(j=0;j<col;j++) 
      b[i][j]=sc.nextInt(); 
    } 
    
   for(i=0;i<row;i++)
     for(j=0;j<col;j++) 
      c[i][j]=a[i][j]-b[i][j];
 
    System.out.println("substraction of two matrix are:-"); 
       for(i=0;i<row;i++)
    {
     for(j=0;j<col;j++) 
      System.out.print(c[i][j] + "\t");   
     System.out.println(); 
    }
  }
}