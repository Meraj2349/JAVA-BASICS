package polymorphism;

public class object {
    String name ;
    int roll;
    int id;


    //Constructor  Method::
  object(String s,int r,int i)
  {
      name=s;
      id=r;
      roll=i;
  }
//defult constructor ::

    object()
    {
        System.out.println("print : meraj");
        name="meraj";
        id=1233;
        roll=235;
    }

    //Method Mode :
   /* void set_ever(String n,int m,int k)
    {
     name=n;
     id=m;
     roll=k;
    }*/
    //Method mode :
    void Result_out()
    {
        System.out.println("Name :"+name);
        System.out.println("roll :"+roll);
        System.out.println("id :"+id);

    }
    /*public void write()
    {
        System.out.println("my name is meraj");
    }*/

}
