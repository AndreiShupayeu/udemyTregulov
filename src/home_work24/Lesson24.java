package home_work24;

import java.lang.reflect.Array;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec=new Mechenosec("Mechik");
        System.out.println("The name of fish: "+mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();
        System.out.println("________________________________________");

        Speakable speakable=new Pingvin("Lolo");
        speakable.speak();
        System.out.println("________________________________________");

        Animal animal=new Lev("Leva");
        System.out.println("The name of animal: "+animal.name);
        animal.eat();
        animal.sleep();
        System.out.println("________________________________________");

        Mammal mammal=new Lev("Second Leva");
        System.out.println("The name of mammal: "+mammal.name);
        mammal.run();
        mammal.eat();
        mammal.speak();
        mammal.sleep();
    }
}
