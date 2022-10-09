package home_work4;

public class Student {
    int studentTicket;
    String name;
    String surname;
    int yearStudying;
    int averageMarkMath;
    int averageMarkEconomy;
    int averageMarkForeignLanguage;

    public Student(int studentTicket, String name, String surname, int yearStudying, int averageMarkMath,
                   int averageMarkEconomy, int averageMarkForeignLanguage) {
        this.studentTicket = studentTicket;
        this.name = name;
        this.surname = surname;
        this.yearStudying = yearStudying;
        this.averageMarkMath = averageMarkMath;
        this.averageMarkEconomy = averageMarkEconomy;
        this.averageMarkForeignLanguage = averageMarkForeignLanguage;
    }

}

class StudentTest {
    void showAverageMark(Student a){
        System.out.println((a.averageMarkEconomy+a.averageMarkMath+a.averageMarkForeignLanguage)/3);
    }
    public static void main(String[] args) {
        Student a = new Student(1, "John", "Malkovich", 2007, 8,
                7, 8);
        Student b = new Student(2, "Stanis", "Baration", 2007, 6,
                6, 5);
        Student c = new Student(3, "Alla", "Petrova", 2009, 9,
                9, 9);
        System.out.println("Средняя оценка по всем предметам Студента a = "
                +(a.averageMarkEconomy+a.averageMarkMath+a.averageMarkForeignLanguage)/3);
        System.out.println("Средняя оценка по всем предметам Студента b = "
                +(b.averageMarkEconomy+b.averageMarkMath+b.averageMarkForeignLanguage)/3);
        System.out.println("Средняя оценка по всем предметам Студента c = "
                +(c.averageMarkEconomy+c.averageMarkMath+c.averageMarkForeignLanguage)/3);


    }
}
