package Overloding_Constructor;
//overloding a para meter different thaktehobe-> student(->para meter)
public class Student {
    String name;
    int id,roll;

    Student()
    {
        System.out.println("no information");
    }

    Student(String n,int i)
    {
        name=n;
        id=i;


    }
    Student(String n,int i,int r)
    {
       name=n;
       id=i;
       roll=r;


    }
    void add(String a,int b,int c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    void add(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    void add()
    {
        System.out.println("method of overloding/polymorphism");
    }

    void print_information()
    {
        System.out.println("name :"+name);
        System.out.println("id :"+id);
        System.out.println("roll :"+roll);
    }
}
