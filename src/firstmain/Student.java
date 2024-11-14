package firstmain;

public class Student {
    //creating a student class
    String name;
    int age;
    int id;
    String div;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", div='" + div + '\'' +
                '}';

    }
    public Student(String name, int age, int id, String div) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.div = div;
    }
    public Student(){

    }
}

