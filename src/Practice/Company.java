package Practice;

public class Company {

    public static void main (String [] args)
    {
        Employe e1=new Employe();
        e1.setName("maerj");
        e1.salary=100;
        System.out.println(e1.getName()+"   salary :"+e1.getsalary());
        Cellphone assuse=new Cellphone();
        assuse.vibrating();
        assuse.reining();
    }
}
