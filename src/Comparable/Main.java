package Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        ArrayList<Movies>movies=new ArrayList<>();
        Scanner s1= new Scanner(System.in);
        Scanner n= new Scanner(System.in);

        int t= n.nextInt();
        for (int i = 0; i <t ; i++) {
            String title= s1.nextLine();
            int year= n.nextInt();
            double reting=n.nextDouble();

            movies.add(new Movies(title,year,reting));

        }

         Collections.sort(movies);

         for(Movies m: movies)
         {
             System.out.println(m);
         }



    }
}
