package Overloding_Constructor;

public class Overloging {
    public static void main(String [] args)
    {
        Student s= new Student();
        s.add();
        Student s1= new Student("meraj",101,34);
        s.add("meraj",3933,222);
        s1.print_information();
        Student s2 =new Student("sohel",101);
        s2.add("meraj",2939);
        s2.print_information();

    }
}
