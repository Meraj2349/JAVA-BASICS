package Thred.Excersice;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        wair_notify obj=new wair_notify();

        obj.start();

        //System.out.println("total number: "+obj.total);

        synchronized (obj)
        {
             obj.wait();

            System.out.println("total number : "+obj.total);
        }
    }
}
