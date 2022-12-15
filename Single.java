class Father
{
  void getdata()
{
   System.out.println("Home"); 
   System.out.println("Money"); 
   System.out.println("Business");
} 
}

 class Child extends Father
{
  void putdata()
{
   System.out.println("BMW"); 
   System.out.println("JOB"); 
 
} 
}


class Single
{
 public static void main(String args[]) 
{
   Child ob=new Child();
   ob.getdata();  
   ob.putdata();  

}
} 