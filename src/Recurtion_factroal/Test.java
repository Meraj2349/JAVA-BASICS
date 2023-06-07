package Recurtion_factroal;
import java.util.*;
public class Test {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        Factorial s1=new Factorial();
       int result = s1.recursion(n);

        System.out.println("factorial :"+result);
    }
}
