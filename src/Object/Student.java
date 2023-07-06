package Object;

public class Student extends Person{



    public Student(String name, Integer id) {
        super(name,id);

        this.name = name;
        this.id = id;
    }



    /*@Override
    public boolean equals(Object o) {

        if (!super.equals(o))
            return false;
        if (this == o)
            return true;
        *//*if (o == null || getClass() != o.getClass())
            return false;*//*
        Student student = (Student) o;
        return id == student.id;


    }*/

    /* @Override
    public void method(String name) {
        super.method(name);
        System.out.println(" student name :"+ name);
    }*/
}
