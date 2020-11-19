import java.util.*;

public class marine{
    public static void main(String[] args) {
        Shark s=new Shark();
        Tuna t= new Tuna();
        batfish b=new batfish();
        Porpoise p=new Porpoise();
        s.eat();
        s.swim();

        t.eat();
        t.swim();

        p.eat();
        p.swim();

        b.eat();
    }
}

abstract class Animal{
    public abstract void eat();
}
abstract class Swimmer extends Animal {
    public abstract void swim();
}

class Shark extends Swimmer{
    @java.lang.Override
    public void eat() {
        //super.eat();
        System.out.println("Shark eats in the ocean");
    }

    @java.lang.Override
    public void swim() {
        System.out.println("Shark swims in the ocean");
    }
}
class Tuna extends Swimmer{
    @java.lang.Override
    public void eat() {
        System.out.println("Tuna eats in the ocean");
    }

    @java.lang.Override
    public void swim() {
        System.out.println("Tuna swims in the ocean");
    }
}
class Porpoise extends Swimmer{
    @java.lang.Override
    public void eat() {
        System.out.println("Porpoise eats in the ocean");
    }

    @java.lang.Override
    public void swim() {
        System.out.println("Porpoise swims in the ocean");
    }
}
class batfish extends Animal{
    @java.lang.Override
    public void eat() {
        System.out.println("Batfish eats in the ocean");
    }
}
