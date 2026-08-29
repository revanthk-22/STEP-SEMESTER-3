class Employee {
    String id;
    double salary;

    Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    void raiseSalary(double amount) {
        this.salary = this.salary + amount;
    }

    void display() {
        System.out.println(id + " | Final Salary: Rs " + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee[] emp = {
            new Employee("E-101", 40000),
            new Employee("E-102", 55000),
            new Employee("E-103", 62000),
            new Employee("E-104", 48000)
        };

        for (int i = 0; i < emp.length; i++) {
            emp[i].raiseSalary(5000);
            emp[i].display();
        }
    }
}