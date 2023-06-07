package Thred;

public class Resource {

    public int count=0 ;
    synchronized void print(String Threadname) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Threadname + count++ +" :" + i);
        }
    }
}
