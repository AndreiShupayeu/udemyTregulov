package home_work9;

import home_work6.Student;

public class DeathObjects {
    public static void main(String[] args) {

        String st = new String("Hi");
        String st1 = new String("By");
        Student student = new Student(1, "Jhon", "Petrov", 2004, 5, 5, 5);
        boolean bool = true;
        boolean boolF = false;
        st = st1;
        st1 = null;
        student = null;


    }
}
