package Problem_Solve;

public  class Tringle extends Shape {

    Tringle(int hight ,int length)
    {
        super(hight,length);
    }

    @Override
    void area() {
        double result =0.5*(hight* length);

        System.out.println("Tringle : " +result);
    }

}
