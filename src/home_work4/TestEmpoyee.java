package home_work4;

import home_work7.Employee;

public class TestEmpoyee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Sidorov", 20, 500, "Dvornik");
        // Employee employee2= new Employee(2, "Privitov", 21, 600); - с помощью private конструктора нельзя даже в этом пакете
        // Employee employee3 = new Employee(3, "Defoltov", 24); - дефолтный недоступен в другом пакете
        employee1.showId();
        employee1.showSurname();
        employee1.showSalary();
       // System.out.println(employee1.id);
        System.out.println(employee1.surname);
       // System.out.println(employee1.age);
        //System.out.println(employee3.salary);- salary имеет private access поэтому не доступна в другом классе
      //  System.out.println(employee1.department);


    }
}
