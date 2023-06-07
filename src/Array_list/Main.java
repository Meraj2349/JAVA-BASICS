package Array_list;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList =new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(60);
        myList.add(40);
        myList.add(30);
        myList.remove(1);
        myList.get(0);
        ArrayList<Integer> myList2 =new ArrayList<>((myList));
        for (Integer i: myList2)
        {
            System.out.println("Lambra expresion :"+i);
        }
        Iterator<Integer>it = myList.iterator();
        while (it.hasNext())
                {
                    System.out.println(it.hasNext());
                }
        HashSet<String>  myhasset;
        myhasset=new HashSet<>();
        myhasset.add("world");
        myhasset.add("meraj");
        myhasset.add("umbrela");


        Iterator<String> itt =  myhasset.iterator();
        while (it.hasNext())
        {
            System.out.println(itt.hasNext());
        }


    }
}
