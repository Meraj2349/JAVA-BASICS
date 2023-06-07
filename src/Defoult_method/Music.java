package Defoult_method;

public interface Music {
    void music8d();
    private void gred()
    {
        System.out.println("private methode how to use in interface");
    }
    default void music3d ()
    {
        gred();
        System.out.println("defoult music 3d");
    }


}
