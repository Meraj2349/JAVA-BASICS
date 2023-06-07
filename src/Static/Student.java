package Static;

public class Student {
  static int count=0;
    int id;
    String name ;
    static String UniversityName="SUST";

  Student()
    {
        count++;
    }

    Student(String s,int i)
    {
        name=s;
        id=i;
    }

    void print_function()
    {
        System.out.println("student no :"+count);
        System.out.println("name :"+name);
        System.out.println("id  :"+id);
        System.out.println("University_Name :"+UniversityName);


    }
//    static void print_function1()
//    {
//        System.out.println("static matod");
//    }


}
