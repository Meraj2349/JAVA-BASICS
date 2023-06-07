package Try_catch;

public class Test {

    public static void main(String[] args) {
        System.out.println("before Exception");
        Test obj=new Test();
        int b=1;
        int a=2;

        try
        {
            int c=1/2;
        }
        catch (Exception e)
        {
               //e is object of exception;
            e.printStackTrace();

        }

        finally {
            //catch ar por aro kono kaj thakle finally use kora lage
        }

       try {
           System.out.println(" after exception");
           obj.run();
       }
     catch (Exception e)
     {
         e.printStackTrace();
     }


    }

     void run() throws NullPointerException,AbstractMethodError
    {
        String s=null;
        System.out.println(s.length());
       // Test obj=new Test();
        System.out.println("static mathod ");

       // throw new AbstractMethodError();
    }
}
