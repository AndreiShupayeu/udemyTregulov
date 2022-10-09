package home_work25;

public class Lesson25 {
    public static void main(String[] args) {
        Animal a1 = new Pingvin("Lolo-a1");
        Animal a2 = new Lev("Leva-a1");
        Animal a3 = new Mechenosec("Mechik-a1");
        Fish f1 = new Mechenosec("Mechik-f1");
        Bird b1 = new Pingvin("Lolo-b1");
        Mammal m1 = new Lev("Leva-m1");
        Mechenosec mech1 = new Mechenosec("Mechik-mech1");
        Pingvin p1 = new Pingvin("Lolo-p1");
        Lev l1 = new Lev("Leva-l1");
        Speakable s1 = new Pingvin("Lolo-s1");
        Speakable s2 = new Lev("Leva-s2");

        Animal[] animals = {a1, a2, a3, f1, b1, m1, mech1, l1, p1};
        Speakable[] speakables = {s1,s2, m1, b1, p1, l1};

        for (int i = 0; i < speakables.length; i++) {
            if (speakables[i] instanceof Pingvin) {
                System.out.println(((Pingvin) speakables[i]).name);
                ((Pingvin) speakables[i]).eat();
                ((Pingvin) speakables[i]).fly();
                ((Pingvin) speakables[i]).sleep();
                ((Pingvin) speakables[i]).speak();
            }
        }
        for (int i = 0; i < speakables.length; i++) {
            if (speakables[i] instanceof Lev) {
                System.out.println(((Lev) speakables[i]).name);
                ((Lev) speakables[i]).eat();
                ((Lev) speakables[i]).run();
                ((Lev) speakables[i]).sleep();
            }
        }

        System.out.println("________________________________________");
        System.out.println();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Mechenosec) {
                System.out.println(((Mechenosec) animals[i]).name);
                ((Mechenosec) animals[i]).eat();
                ((Mechenosec) animals[i]).swim();
                ((Mechenosec) animals[i]).sleep();
            }
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Pingvin) {
                System.out.println(((Pingvin) animals[i]).name);
                ((Pingvin) animals[i]).eat();
                ((Pingvin) animals[i]).fly();
                ((Pingvin) animals[i]).sleep();
                ((Pingvin) animals[i]).speak();
            }
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Lev) {
                System.out.println(((Lev) animals[i]).name);
                ((Lev) animals[i]).eat();
                ((Lev) animals[i]).run();
                ((Lev) animals[i]).sleep();
            }
        }
    }
}
