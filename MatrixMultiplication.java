
class MatrixMultiplication
 { 
 public static void main(String args[])
  {
   int a[][]={{1,2,3},{4,3,5},{3,2,4}};
   int b[][]={{1,3,2},{2,4,6},{1,3,2}}; 
   int c[][]=new int[3][3]; 
   int i,j,k;  
    
   
   for(i=0;i<3;i++)
   {
     for(j=0;j<3;j++)
   {

   c[i][j]=0; 
   for(k=0;k<3;k++)  
   {
    c[i][j]=c[i][j]+a[i][k]*b[k][j]; 
   } 
   System.out.print(c[i][j]+" ");
   } 
   System.out.println(); 
  } 
  }
}
  
