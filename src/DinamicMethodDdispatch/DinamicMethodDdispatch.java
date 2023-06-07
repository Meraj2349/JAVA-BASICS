package DinamicMethodDdispatch;

public class DinamicMethodDdispatch {

    public static void main(String[] args) {
      // super class == sub class;
        //super class theke sub class access newaer maddhomi  hoilo DMD
        one obj = new two();
        obj.name();
        obj.music();

       // ***obj.music(); not allowed


        //only overriding allowed sub  class function
        two obj2 = new two();

        obj2.method();
    }
}
