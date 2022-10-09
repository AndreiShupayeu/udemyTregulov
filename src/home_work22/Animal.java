package home_work22;

import p1.p2.p3.C;

public class Animal {
    int eyes;

    Animal() {
        System.out.println("I am animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    Pet() {
        System.out.println("I am Pet");
        eyes = 2;
    }

    String name;
    int tail = 1;
    int paw = 4;

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + this.name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}
class Cat extends Pet{
    Cat(String name){
        this.name=name;
        System.out.println("I am cat and my name is: "+ this.name);
    }
    void sleep(){
        System.out.println("Cat sleeps");
    }
}
class Test{
    public static void main(String[] args) {
        Dog dog=new Dog("Baykal");
        Cat cat=new Cat("Aleks");
        System.out.println("Amount dog's paws: "+dog.paw);
        cat.sleep();
    }
}