package Number_game;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Game obj =new Game();

        Scanner sc = new Scanner(System.in);
        int n=0;
        obj.SetCounter();

        while (true)
        {
           n= sc.nextInt();

           obj.SetNumber(n);

           if(obj.isCorrectNumber()==0)
           {
               System.out.println("Congratulations, You've guessed the number.");

               System.out.println("Number of counts :"+(obj.count));

               break;


           }

          else if (obj.isCorrectNumber()==-1)
           {
               System.out.println("Higher number please!");
               System.out.println("Number of counts :"+(obj.count++));
           }
           else if (obj.isCorrectNumber()==1)
           {
               System.out.println("lower number please!");
               System.out.println("Number of counts :"+(obj.count++));

           }


        }
    }

}
