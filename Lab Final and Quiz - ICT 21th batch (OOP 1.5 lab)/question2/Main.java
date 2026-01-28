class Employee {
    double calculateSalary() {
        return 0;
    }
}
class FullTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 140*200;
    }
}
class PartTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 80*200;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp;

        emp=new FullTimeEmployee();
        System.out.println("Full Time Salary: "+emp.calculateSalary());

        emp=new PartTimeEmployee();
        System.out.println("Part Time Salary: "+emp.calculateSalary());
    }
}
