package Overriding;

public class Cascate extends Businees{

      public int id;

        @Override
        public void printName() {
            // some more changes
            System.out.println(" company name  : " + company);
        }
    public void printName2() {
        // some more changes
        System.out.println("  amount  : "+ company+ amount);
    }
    }

