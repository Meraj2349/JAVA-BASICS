package Problem_Solve;

public class Circle extends Shape {

    Circle(int hight,int length)
    {
        super(hight,length);
    }

    @Override
    void area() {
        double result= Math.PI*hight*length;

        System.out.println("Circul :"+result);
    }

}
