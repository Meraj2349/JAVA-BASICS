package Object;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<Student>();




       /* Person obj =new Person("meraj",1234);
        Person obj2=new Person("meraj",1234);*/

        /*Person s1= new Student("meraj",1234);
        Person s2 =new Student("mkcmj",2134);*/

        Student s1= new Student("meraj",1234);
        Student s2 =new Student("meraj",1234);
        Student s3= new Student("meraj2",13422);
        Student s4 =new Student("mkcmj2",21434);



        if(s1.equals(s2))
        {
            array.add(s1);
        }
        if(s3.equals(s4))
        {
            array.add(s1);
        }



       /* if (!array.contains(obj)) {
            array.add(obj);
        }

        if (!array.contains(obj2)) {
            array.add(obj2);
        }*/
       /* if (!array.contains(s1)) {
            array.add(s1);
        }
        if (!array.contains(s2)) {
            array.add(s2);
        }*/


        for (Student a: array)
        {
            System.out.println("Name  :"+a.name+" Id :"+a.id);
        }


       // System.out.println( obj.equals(s1));
      //  System.out.println( s1.equals(obj));

       /* s1.method("meraj");
        obj2.method("meraj");

        s5.method1();*/



    }
}
