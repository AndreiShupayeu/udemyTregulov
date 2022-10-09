package home_work6;

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
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(1, "Valera", "Soskovets", 2004);
        Student student3 = new Student(2, "Petr", "Mihaltsov", 2005, 10,
                9, 5);
    }
}

