package polymorphismexample;

public class SampleClass {

    public static void sum(int a, int b){
        System.out.println("Sum of two integer is: " + (a+b));
    }
    public static void sum(int a, int b, int c){
        System.out.println("Sum of three integer is: " + (a+b+c));
    }
    public static void sum(double a, double b){
        System.out.println("Sum of double  is: " + (a+b));
    }
    public static void sum(float a, float b){
        System.out.println("Sum of two float is: " + (a+b));
    }
}
