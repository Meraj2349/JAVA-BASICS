package Thred.Excersise2;

import Thred.Exce.Main;

public class RunMethod extends Thread{

    @Override
    synchronized public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(" i :"+i);

        }
    }

    public static void main(String[] args) {

        RunMethod obj=new RunMethod();
        obj.start();

        obj.run();

        for (int i = 0; i < 10; i++) {
            System.out.println(" main  :"+i);
        }

    }
}
