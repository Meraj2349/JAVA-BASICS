package Object;

import java.util.Objects;

public class Person {

   public String name;
  public  Integer id;

    public Person(String name, Integer id) {
        this.name = name;
        this.id = id;
    }


    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }*/

    @Override
    public boolean equals(Object o) {

       /* if (this == o) {

            return true;

        }*/

       /* if (o==null || this.getClass()!= o.getClass())
        {
            return false;

        }
*/
        //Student obj1= (Person) o;


        Person obj2 = (Student) o;
        return this.name.equals(obj2.name)
             && this.id.equals(obj2.id);
//        {
//            return true;
//        }

        //this.id= ((Integer) o);


        //Person obj= new Person((String) o,(Integer) o);

        //if ()
       /* if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        return Objects.equals(getName(), person.getName()) && Objects.equals(getId(), person.getId());*/
    }

   /* @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }*/


}
