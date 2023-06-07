package Defoult_method;

public interface Video {
     void video4K();
    default void video420p()

    {

        System.out.println("defoult ");
    }
}
