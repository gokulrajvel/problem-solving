package Employees;

public class Employees1 {
    protected String employeeName;
    protected String address;
    protected int salary;
    protected String jobTitle;
    public Employees1(String employeeName, String address, int salary, String jobTitle) {
        this.employeeName = employeeName;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public void display(){
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
        System.out.println("Job Title: "+jobTitle);
    }
}