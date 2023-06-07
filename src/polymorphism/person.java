package polymorphism;



public class person {

   public static void main(String [] args)
   {
       //Constructor system ::
       object p1=new object("meraj",123,34);

       //method system::

//       p1.name="meraj";
//       p1.id=334;
//       p1.roll= 34;

   //Method Mode:
      // p1.set_ever("meraj",123,34);
       p1.Result_out();


       object p2=new object("sovon",122,35);
//       p2.name="rohim";
//       p2.id=444;
//       p2.roll= 35;
       //default constructor ::
       object p3 =new object();

       p3.Result_out();

// Mothod mode:

      // p2.set_ever("sovon",122,35);
       p2.Result_out();
      // p1.write();



   }


}
