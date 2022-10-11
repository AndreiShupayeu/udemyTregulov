package home_work29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Student {
    String name;
    char sex;
    int age;
    int course;
    int grade;

    public Student(String name, char sex, int age, int course, int grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}

class StudentInfo {
    void testStudents(ArrayList<Student> al, Predicate<Student> t) {
        for (Student s : al) {
            if (t.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Vany", 'm', 20, 3, 5);
        Student s2 = new Student("Andrei", 'm', 28, 1, 4);
        Student s3 = new Student("Aleks", 'm', 30, 5, 10);
        Student s4 = new Student("Olga", 'f', 26, 4, 4);
        Student s5 = new Student("Anna", 'f', 19, 2, 8);
        Student s6 = new Student("Yana", 'f', 24, 3, 8);
        Student s7 = new Student("Yaroslav", 'm', 25, 4, 9);

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        al.add(s6);
        al.add(s7);

        for (Student s : al) {
            System.out.println(s);
        }


        StudentInfo studentInfo = new StudentInfo();

        System.out.println("*********************************");
        studentInfo.testStudents(al, t->t.grade>=5);



    }
}
