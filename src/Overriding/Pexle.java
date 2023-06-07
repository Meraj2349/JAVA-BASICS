package Overriding;

public class Pexle extends Businees{
    public int revenue;

    // method overriding
    @Override
   /* public void printName() {
        company = "MS" + company;
        System.out.println("change company : " + company);
    }*/
    public void printName2() {

        amount = 100+amount;

        System.out.println("amount number :"+company +amount);
    }
}
