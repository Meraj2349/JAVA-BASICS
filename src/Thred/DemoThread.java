package Thred;

public class DemoThread extends Thread {

    Resource resource;
    public DemoThread(Resource resource)
    {

        this.resource=resource;
    }


//    private String className;
//
//
//    public DemoThread(String className)
//    {
//        this.className=className;
//
//    }

    @Override
    public void run() {
       // print();

        resource.print("thread Nane ");
    }

//   void print()
//    {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(className+" :"+i);
//
//        }

  //  }
}
