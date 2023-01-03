public class String_Builder_Pro
{
    public static void main(String args[])
    {
     // Declaration of String Builder 

        StringBuilder sb=new StringBuilder("Mehar"); 
        System.out.println(sb);

    // char at index 0
        System.out.println(sb.charAt(0));

    //set char at index 0
        sb.setCharAt(0,'Z'); 
        System.out.println(sb);

    //insert an element
        sb.insert(4,'n'); 
        System.out.println(sb);
        
    // delete 
        sb.delete(4,5);
        System.out.println(sb);

    //append
        sb.append("java"); 
        System.out.println(sb);

    //Reverse the String using StringBuilder:-
    StringBuilder sb2=new StringBuilder("Mehrun"); 
    for(int i=0;i<sb2.length()/2;i++)
    {
        int front=i;
        int back=sb2.length()-1-i; 
        
        char frontChar=sb2.charAt(front);
        char backChar=sb2.charAt(back);

        sb2.setCharAt(front , backChar);
        sb2.setCharAt(back , frontChar); 

    }
     System.out.println("Reverse String is " +sb2);
      
    }
}
