package home_work7;

public class TestEmpoyee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Sidorov", 20, 500, "Dvornik");
        //   Employee employee2= new Employee(2, "Privitov", 21, 600); - с помощью private конструктора нельзя даже в этом пакете
        Employee employee3 = new Employee(3, "Defoltov", 24);
        employee1.showId();
        employee1.showSurname();
        employee1.showSalary();
        System.out.println(employee3.id);
        System.out.println(employee3.surname);
        System.out.println(employee3.age);
       // System.out.println(employee3.salary);- salary имеет private access поэтому не доступна в другом классе
        System.out.println(employee3.department);


    }
}