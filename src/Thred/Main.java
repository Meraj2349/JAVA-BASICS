package Thred;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Resource resource= new Resource();
        DemoThread obj= new DemoThread(resource);
        DemoThread obj2= new DemoThread(resource);
          obj.start();
          obj2.start();
          obj2.join();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" :"+i);
        }

        System.out.println("main therad");

    }
}


