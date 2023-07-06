package comparatro.excersice;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList <Student> s1 =new ArrayList<Student>();

        s1.add(new Student("meraj",21,8.5));
        s1.add(new Student("meraj",23,7.5));
        s1.add(new Student("meraj",19,7.8));
        s1.add(new Student("meraj",10,9.1));

        Collections.sort(s1,new SortbyAge());
        for (Student s: s1) {

            System.out.println("title :"+s.getName()+" age :"+ s.getAge()+"rating :"+s.getReting());

        }

        System.out.println("========================================================================");
        Collections.sort(s1,new SortbyReting());
        for (Student s: s1) {

            System.out.println("title :"+s.getName()+" age :"+ s.getAge()+"rating :"+s.getReting());

        }

    }
}

