class Vararg 
{ 
  void add(int... a)
  {
      int sum=0; 
      for(int x:a)  // to convert int[]a to int type:-  
      {
        sum=sum+x;
      } 
  
     System.out.println("sum of the number is= " +sum); 
  }
  public static void main(String args[])
 {
  
  Vararg v=new Vararg(); 
  v.add(); 
  v.add(10,20); 
  v.add(30,40,50);  
 }
}