package home_work25;

abstract class Animal {
 public String name;

    Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }
    void sleep(){
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name=name;
    }
    abstract void fly();
    public void speak(){
        System.out.println(name + " sings");
    }
}
abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name=name;
    }
    abstract void run();
}
interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}
class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name=name;
    }
    void eat(){
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm");
    }
    void swim(){
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }
}
class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name=name;
    }
    void fly(){
        System.out.println("Pingvini ne umeyut letat!");
    }
    void eat(){
        System.out.println("Pingvin lyubit est ribu!");
    }
    void sleep(){
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }
    public void speak(){
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}
class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name=name;
    }
    void eat(){
        System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
    }
    void sleep(){
        System.out.println("Bolshuyu chast dnya lev spit!");
    }
    void run(){
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    }
}


