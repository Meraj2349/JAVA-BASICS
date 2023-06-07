package comparatro;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Movie> movies=new ArrayList<>();

        movies.add(new Movie("purfume",1990,8.2));
        movies.add(new Movie("purfume1",1490,7.3));
        movies.add(new Movie("purfume4",1090,8.9));
        movies.add(new Movie("purfume7",1980,8.6));
        movies.add(new Movie("purfume7",1970,8.3));

         Comparator<Movie> com =new Comparator<Movie>() {
             @Override
             public int compare(Movie o1, Movie o2) {
                if (o1.getRating()>o2.getRating()){
                    return 1;
                }
                else return -1;
             }
         };
        Collections.sort(movies,com);

        for(Movie v: movies)
        {
            System.out.println(v);
        }
    }
}
