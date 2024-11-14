package polymorphismexample;

public class MainClass {
    public static void main(String[] args){

        SampleClass s1 = new SampleClass();

        s1.sum(4,5);
        s1.sum(4,5,10);
        s1.sum(4.0,6.0);
        s1.sum(4.0f,6.1f);

    }
}
 