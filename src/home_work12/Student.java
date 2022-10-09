package home_work12;

public class Student {
    int studentTicket;
    String name;
    String surname;
    int yearStudying;
    int averageMarkMath;
    int averageMarkEconomy;
    int averageMarkForeignLanguage;

    public Student(int studentTicket3, String name3, String surname3, int yearStudying3, int averageMarkMath3,
                   int averageMarkEconomy3, int averageMarkForeignLanguage3) {
        studentTicket = studentTicket3;
        name = name3;
        surname = surname3;
        yearStudying = yearStudying3;
        averageMarkMath = averageMarkMath3;
        averageMarkEconomy = averageMarkEconomy3;
        averageMarkForeignLanguage = averageMarkForeignLanguage3;
    }

    Student(int studentTicket4, String name4, String surname4, int yearStudying4) {
        this(studentTicket4, name4, surname4, yearStudying4, 0, 0, 0);
    }

    Student() {
    }
}

class StudentTest {
    public static void compareStudentsByAddress(Student student1, Student student2) {
        if (student1 == student2) {
            System.out.println("Students have equal addresses!");
        } else {
            System.out.println("Students haven't equal addresses!");
        }
    }

    public static void compareStudentsByAllAttributesSimultaneously(Student s1, Student s2) {
        if (s1.studentTicket == s2.studentTicket && s1.surname.equals(s2.surname) && s1.name.equals(s2.name)) {
            System.out.println("Students are equals!");
        } else {
            System.out.println("Students aren't equals!");
        }
    }

    public static void compareStudentsByAllAttributes(Student student1, Student student2) {
        if (student1 != student2) {
            if (student1.studentTicket == student2.studentTicket) {
                if (student1.surname.equals(student2.surname)) {
                    if (student1.name.equals(student2.name)) {
                        if (student1.yearStudying == student2.yearStudying) {
                            System.out.println("Students are equal by attributes!");
                        } else {
                            System.out.println("yearStudyings aren't equal!");
                        }
                    } else {
                        System.out.println("names aren't equal!");
                    }
                } else {
                    System.out.println("Surnames aren't equal!");
                }
            } else {
                System.out.println("studentTickets aren't equal!");
            }
        } else {
            System.out.println("Students are equal by attributes!");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(1, "Valera", "Soskovets", 2004);
        Student student3 = new Student(2, "Petr", "Mihaltsov", 2005, 10,
                9, 5);
        Student student4 = student2;
        Student student5 = new Student(1, "Valera", "Soskovets", 2004);

        compareStudentsByAddress(student2, student4);
        compareStudentsByAddress(student1, student3);
        compareStudentsByAllAttributes(student4, student2);
        compareStudentsByAllAttributes(student5, student2);
        compareStudentsByAllAttributes(student2, student3);
    }
}
