package home_work29;

import p4.p5.E;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        Employee e1=new Employee("Andrei","IT",1000);
        Employee e2=new Employee("Vasiliy","IT",450);
        Employee e3=new Employee("Vania","Accounting",100);
        Employee e4=new Employee("Anna","Education",100);
        Employee e5=new Employee("Elena","Cleaning",50);
        Employee e6=new Employee("Petr","Petr",50);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        TestEmployee te=new TestEmployee();
        te.filtraciyaRabotnikov(employees, x->x.department.equals("IT")&&x.salary>200);
        System.out.println("***********************************************");
        te.filtraciyaRabotnikov(employees, x->x.name.startsWith("E")&&x.salary<=450);
        System.out.println("***********************************************");
        te.filtraciyaRabotnikov(employees, x->x.department.equals(x.name));

    }
    public void printEmployee(Employee employee) {
        System.out.println(employee);
    }

    public void filtraciyaRabotnikov(ArrayList<Employee> employees, Predicate<Employee> p) {
        for (Employee employee : employees) {
            if (p.test(employee)) {
                printEmployee(employee);
            }
        }
    }
}
