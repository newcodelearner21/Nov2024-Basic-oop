package encapsulationexample;

public class MainClass {
public static void main(String[] args){
    //creating class - student and object - s1
    Student s1 = new Student();
    s1.setName("akash");
    s1.setAge(6);
    s1.setId(15);
    s1.setDiv("C");

    System.out.println("S1 after setting values : " +  s1);
    System.out.println("S1 name: " + s1.getName());

}
}
