package TrafficLight;

public class TrafficLights /*implements Comparable*/ {
    String color;
   int duration;

   public TrafficLights(String color,int duration){
        super();
        this.color=color;
        this.duration=duration;
    }
    public void setColor(String newcolor) {
        color=newcolor;
    }

    public boolean isRed() {
        return color.equals("red");
    }

    public boolean isGreen() {
        return color.equals("green");
    }

    public int getDuration() {
            return duration;

    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
//    public void change_colour()
//    {
//
//    }

    /*@Override
    public int compareTo(Object o) {
        TrafficLights Light=(TrafficLights) o;
        if (this.getDuration()< ((TrafficLights) o).duration){
            return -1;

        }
        else return 1;
    }
*/
    @Override
    public String toString() {
        return "TrafficLights{" +
                "color='" + color + '\'' +
                ", duration=" + duration +
                '}';
    }
}
