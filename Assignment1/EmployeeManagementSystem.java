abstract class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("-----------------------------");
        System.out.println("Employee ID   : " + getId());
        System.out.println("Employee Name : " + getName());
        System.out.println("Salary        : Rs" + String.format("%.2f", calculateSalary()));
    }
}

class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Polymorphism: override calculateSalary()
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n[ Full-Time Employee ]");
        super.displayDetails();
        System.out.println("Type          : Full-Time");
    }
}

class PartTimeEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name,
                            double hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n[ Part-Time Employee ]");
        super.displayDetails();
        System.out.println("Hours Worked  : " + hoursWorked);
        System.out.println("Hourly Rate   : Rs" + String.format("%.2f", hourlyRate));
        System.out.println("Type          : Part-Time");
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        System.out.println("=== Employee Management System ===");

        // Runtime Polymorphism: parent-class references hold child objects
        Employee emp1 = new FullTimeEmployee(101, "Gokulraj V", 50000.00);
        Employee emp2 = new PartTimeEmployee(102, "Gokul", 80, 250.50);
        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayDetails();
        }

        System.out.println("\n-----------------------------");
        System.out.println("Total employees processed: " + employees.length);
    }
}