package Variable_length_argument;

public class variable {
     void add(int ...num)
     {
         int sum=0;
         for (int  x: num ) {
             System.out.print(x+" ");
         }
         System.out.print("\n");

     }

}
