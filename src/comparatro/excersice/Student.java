package comparatro.excersice;

public class Student {
    private String name ;
    private Integer age;

    private double Reting ;

    public Student(String name, Integer age, double reting) {
        this.name = name;
        this.age = age;
        Reting = reting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getReting() {
        return Reting;
    }

    public void setReting(Integer reting) {
        Reting = reting;
    }
}
