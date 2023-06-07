package Problem_Solve;



public class Solve {


    public static void main(String[] args) {
        //super class obj = sub class
        Shape obj =new Circle(10,20);
        Shape obj1=new Rectangle(20,40);
        Shape obj3=new Tringle(10 ,20);

        obj.area();
        obj1.area();
        obj3.area();
    }

}