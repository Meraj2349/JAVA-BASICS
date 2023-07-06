package comparatro.excersice;

import java.util.Comparator;

public class SortbyReting implements Comparator <Student>{





    @Override
    public int compare(Student o1, Student o2) {
       if (o1.getReting() > o2.getReting())
       {
           return 1;

       }
       else {
           return -1;
       }
    }
}
