package firstmain;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello Moto");

        Student student1 = new Student();
        student1.name = "Raj";
        student1.age = 21;
        student1.id = 111;
        student1.div = "A";

        System.out.println("Student with default constructor: "+ student1);

        Student student2 = new Student("ajay",23,124,"B");
        System.out.println("Student with parameterized constructor: "+ student2);


    }
}
