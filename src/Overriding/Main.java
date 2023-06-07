package Overriding;

public class Main {

        public static void main(String[] args) {
            Pexle com = new Pexle();
            com.company = "pexle";

            Cascate com2 = new Cascate();
            com2.company = "cascate";

            Pexle amo = new Pexle();
            amo.amount = 1000;
            amo.printName2();

            Cascate amo2= new Cascate();
            amo.amount = 2000;

            Businees p = new Businees();
            p.company = "real estate";
            p.printName();

            p = com;
            p.printName();

            p = com2;
            p.printName();

            p=amo;
            p.printName2();

            p=amo2;
            p.printName2();

        }
    }

