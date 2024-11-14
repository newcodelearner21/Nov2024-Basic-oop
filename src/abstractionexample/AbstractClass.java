package abstractionexample;

public abstract class AbstractClass {
    //Abstract class are class which contain abstract method
    // Abstract method - it does not contain body

    public abstract void demo1();

    //concrete method - it contains a body

    public void demo2(){
        System.out.println("demo2 is a concrete method inside Abstract Class.");
    }
}
