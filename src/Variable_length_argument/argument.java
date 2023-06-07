package Variable_length_argument;
import java.util.*;
public class argument {

    public static void main(String [] args)
    {
       Scanner s2= new Scanner(System.in);
               int a= s2.nextInt();
               int b= s2.nextInt();
        variable s1=new variable();
        s1.add(a,b,30);
        s1.add(10,20,30,40);
        s1.add(10,20);
    }

}
