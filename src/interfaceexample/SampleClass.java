package interfaceexample;

public class SampleClass implements SampleInterface{
    @Override
    public void demo1(){
        System.out.println("abc value is: " + SampleInterface.abc);
        System.out.println("demo1 implementation inside sample class.");


    }

    @Override
    public void demo2(){
        System.out.println("xyz value is: " + SampleInterface.xyz);
        System.out.println("demo2 implementation inside sampleclass.");


    }

}
