package Employees;

public class Developer extends Employees1 {
    private String managingProjects;
    private String performs;
    private double bonus;
    public Developer(String employeeName, String address, int salary, String jobTitle) {
        super(employeeName, address, salary, jobTitle);
    }
    public void calculateBonus(int percentage) {
        this.bonus=salary*((double)percentage/100);
    }
    public void performsReport(String report) {
        this.performs="Report: "+report;
    }
    public void managingProjects(String projects) {
        this.managingProjects="Projects: "+projects;
    }
    public void display(){
        super.display();
        System.out.println("Bonus: "+bonus);
        System.out.println(managingProjects);
        System.out.println(performs);

    }
}

