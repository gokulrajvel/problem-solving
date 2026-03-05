import java.util.Scanner;

public class Employee2 {
    public static void main(String[] args) {
        EmployeeDetails2 obj=new EmployeeDetails2();
        String[] emp=obj.getEmp();
    }
}

class EmployeeDetails{
    Scanner scan=new Scanner(System.in);
    public String getName(String str){
        return scan.nextLine();
    }
}

class EmployeeDetails2 extends  EmployeeDetails{
    String[] emp=new String[3];
    public String[] getEmp(){
        String[] emp=new String[3];
        emp[0]=getName("Enter the name: ");
        emp[1]=getName("Enter the age: ");
        emp[2]=getName("Enter the DOB: ");
        return emp;
    }

}
