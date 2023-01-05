import java.util.*;
public class KnapsackProblem
{ 

      static int max(int x, int y) 
    {
        return (x > y) ? x : y;
    } 


 static int knapSack(int M, int w[], int p[], int n) 
{
   
    int K[][]=new int[n+1][M+1]; 
    
   for (int i = 0; i <= n; i++)     // i for rows
   {
      for (int wt = 0; wt <= M; wt++)   //wt for columns
       {
         if (i == 0 || wt == 0)
            K[i][wt] = 0;
         else if (w[i - 1] <= wt)
            K[i][wt] = max(p[i - 1] + K[i - 1][wt - w[i - 1]], K[i - 1][wt]);
         else
        K[i][wt] = K[i - 1][wt];
      }
   } 
   
   return K[n][M];
}




    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number of items in a Knapsack:");
        int n=sc.nextInt();
        System.out.println("Enter the capacity of knapsack"); 
        int M=sc.nextInt();     // M is nothing but capacity

        int p[]=new int[n];     // p is profit
        int w[]=new int[n];     // w is weight 

        

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the profit and weight of an item : ");
                p[i]=sc.nextInt();
                w[i]=sc.nextInt(); 
        }


        System.out.println("The maximum possible profit into knapsack is " +knapSack(M,w,p,n)); 
    }
}
