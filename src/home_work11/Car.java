package home_work11;

public class Car {
    String color;
    String engine;
    int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

    public Car() {

    }
}
class CarTest{
    public static void changeAmountOfDoors(Car car,int a){
       car.doors=a;
    }
    public static void changeColorCars(Car car1,Car car2){
        Car car=new Car();
        car.color=car1.color;
        car1.color=car2.color;
        car2.color= car.color;
    }

    public static void main(String[] args) {
        Car car1=new Car("Red","V-6",5);
        Car car2=new Car("Green", "V-7", 7);
        changeColorCars(car1,car2);
        System.out.println("Color car1: "+car1.color);
        System.out.println("Color car2: "+car2.color);
        changeAmountOfDoors(car1,7);
        System.out.println("Amount of doors car1: "+car1.doors);

    }
}
