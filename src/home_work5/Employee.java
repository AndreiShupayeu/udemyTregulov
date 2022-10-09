package home_work5;

import java.security.spec.ECParameterSpec;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age,double salary, String department){
        this.id=id;
        this.surname=surname;
        this.age=age;
        this.salary=salary;
        this.department=department;
    }
    void increaseSalary(){
        salary*=2;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1=new Employee(1, "Shupaev", 41,2000,"IT");
        Employee employee2=new Employee(2, "Shupaeva", 43, 500, "Education");
        employee1.increaseSalary();
        employee2.increaseSalary();
        System.out.println("Зарплата "+employee1.surname+" "+employee1.salary+" usd");
        System.out.println("Зарплата "+employee2.surname+" "+employee2.salary+" usd");
    }
}
