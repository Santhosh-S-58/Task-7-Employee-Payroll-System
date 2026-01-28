class Employee {

    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double calculateSalary() {
        return 0;
    }

    public void displayDetails() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
    }
}

class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeePayroll {

    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(101, "Santhosh", 30000);
        Employee emp2 = new PartTimeEmployee(102, "Rahul", 80, 250);

        Employee[] employees = {emp1, emp2};

        System.out.println("----- Payroll Summary -----");

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary        : " + emp.calculateSalary());
            System.out.println();
        }
    }
}
