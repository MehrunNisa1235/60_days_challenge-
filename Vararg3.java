class Vararg3
{ 
  void display(int num,String... s)
  {
    System.out.println("Roll no : " +num); 
     for(String s1:s)
      System.out.println("this is : "+s1); 
  }
 public static void main(String args[]) 
 { 
   Vararg3 v=new Vararg3(); 
    v.display(21,"mehar"); 
    v.display(03,"class C.R","My hero hihihi"); 
 }
}