import java.util.Scanner;

public class Employee2 {
    public static void main(String[] args) {
        EmployeeDetails2 obj = new EmployeeDetails2();
        String[] emp = obj.getEmp();
        obj.printEmp(emp);
    }
}

class EmployeeDetails {
    Scanner scan = new Scanner(System.in);

    public String getUser(String str) {
        System.out.println(str);
        return scan.nextLine();
    }
}

class EmployeeDetails2 extends EmployeeDetails {
    String[] emp = new String[3];

    public String[] getEmp() {
        emp[0] = getUser("Enter the name: ");
        emp[1] = getUser("Enter the age: ");
        emp[2] = getUser("Enter the DOB: ");
        return emp;
    }

    public void printEmp(String[] emp) {
        System.out.println("Name: " + emp[0]);
        System.out.println("age: " + emp[1]);
        System.out.println("DOB: " + emp[2]);
    }

}
