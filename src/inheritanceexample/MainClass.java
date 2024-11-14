package inheritanceexample;

public class MainClass {
    public static void main(String[] args){

        System.out.println("---------------Animal Parent Class---------------");
        Animal animal = new Animal();
        animal.breathe();
        animal.eat();
        animal.sleep();

        System.out.println("---------------Human Child Class---------------");
//        Human human = new Human();
        Human.breathe();
        Human.eat();
        Human.sleep();
        Human.read();
        Human.think();


        System.out.println("---------------Bird Child Class---------------");
        Bird.breathe();
        Bird.eat();
        Bird.sleep();
        Bird.fly();

        System.out.println("---------------Fish Child Class---------------");
        Fish.eat();
        Fish.breathe();
        Fish.sleep();
        Fish.swim();
    }
}
