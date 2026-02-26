public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Gokulraj", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Giri", 80, 500);
        System.out.println("--- Employee Management System ---");
        emp1.display();
        emp2.display();
    }
}

class Employee {
    private int id;
    private String name;
    public  Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double calculateSalary() {
        return 0.0;
    }
    public void display() {
        System.out.println("Id : "+id+"\nName : "+name+"\nsalary : "+calculateSalary());
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
