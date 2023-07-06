package Thred.Exce;
class thread3 extends Thread{
    // n;
   // String name;


//    public thread3(String name) {
//        //this.n=n;
//        this.name=name;
//
//    }

    @Override
    synchronized public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                System.out.println(currentThread().getName()+" "+i);

            }
        }
        catch (Exception e)
        {

        }

    }
}
class table{

    synchronized void loop(String threadName,int n)
    {
        try {
            for (int i = 0; i < 5; i++) {

                System.out.println(threadName+" "+n*i);
            }
        }
        catch (Exception e){

        }

    }
}

class thread1 extends Thread{

    table n;
    thread1(table n)
    {
        this.n=n;
    }

    @Override
    public void run() {
        n.loop(currentThread().getName(),5);
       // System.out.println(currentThread().getName());
    }
}
class thread2 extends Thread{
     table n;
    thread2(table n)
    {
        this.n=n;
    }

    @Override
    public void run() {

         n.loop(currentThread().getName(),100);
        //System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {

        table t= new table();
        thread1 t1=new thread1(t);
        thread2 t2=new thread2(t);
        thread3 t3=new thread3();
        t3.start();




       // t1.start();
        //t2.start();



    }
}
