package encapsulationexample;
/*encapsulation - hides the data variable & accesses them using getter and setter
               Note: set access modifier/specifier as private  */
public class Student {

    private String name;
    private int age;
    private int id;
    private String div;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", div='" + div + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiv() {
        return div;
    }

    public int getId() {
        return id;
    }
}
