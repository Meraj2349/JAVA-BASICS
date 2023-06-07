package TrafficLight;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<TrafficLights> Light=new ArrayList<TrafficLights>();
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        Scanner n=new Scanner(System.in);

        int t=n.nextInt();
        for (int i = 0; i < t; i++) {
            String color= s1.nextLine();
            String color_change= s3.nextLine();
            int duration= s2.nextInt();


           TrafficLights l1= new TrafficLights(color,duration);

           l1.toString();

           l1.setColor(color_change);

            System.out.println(l1.getDuration());
            System.out.println(l1.isGreen());
            System.out.println(l1.isRed());



        }




       /*Collections.sort(Light);

        for (TrafficLights s:Light) {
            System.out.println(s);

        }*/
    }
}
