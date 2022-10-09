package home_work7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    private Employee(int id, String surname, int age, double salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
    Employee(int id, String surname, int age) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
    void increaseSalary() {
        salary *= 2;
    }
    public void showId() {
        System.out.println("Id работника: " + id);
    }
    public void showSalary() {
        System.out.println("Зарплата работника: " + salary);
    }
    public void showSurname() {
        System.out.println("Фамилия работника: " + surname);
    }
}



