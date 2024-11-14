package inheritanceexample;

public class Human extends Animal{
    public static void read(){
        System.out.println("Humans can read.");
    }
    public static void think(){
        System.out.println("Humans can think.");
    }

    //Override method:Is a process of changing the implementation of a parent class in child class
    public static void sleep(){
        System.out.println("Human can sleep.");
    }

    public  static void eat(){
        System.out.println("Human can eat.");
    }

    public static void breathe(){
        System.out.println("Human can breathe.");
    }
}
