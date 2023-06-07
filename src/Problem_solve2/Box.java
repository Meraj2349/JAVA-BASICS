package Problem_solve2;

public class Box {
    double height,width,depth;
    static double count=0;
    Box()
    {
        count++;
    }
    Box(double height,double width,double depth)
    {
       this.height=height;
       this. width=width;
        this.depth=depth;
    }

    void DisplayVal()
    {
        System.out.println("Box number :"+count);
                 double val=height+width*depth;
        System.out.println("box val :"+val);
        System.out.println('\n');
    }


}
