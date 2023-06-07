package Problem_Solve;

public class Rectangle extends Shape{


    Rectangle(int hight,int length)
    {
        super(hight,length);
    }

    @Override
    void area() {
        int result =hight* length;
        System.out.println("Rectangle area: " +result);
    }

}
