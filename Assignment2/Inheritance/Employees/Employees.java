package Employees;

import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager mg=new Manager("Gokulraj","1/52, New Busstand, Vellore",55000,"Manager");
        Developer dev=new Developer("Bala","59/1, KMB, Chennai",35000,"Developer");
        Programmer pro=new Programmer("Prabha","5/1,Fun Republic Mall Coimbatore",30000,"Programmer");
        mg.calculateBonus(12);
        mg.performsReport("He Manage the team good.");
        mg.managingProjects("Maintain All Projects");
        System.out.println("------------------- Manager Details -------------------");
        mg.display();
        System.out.println("------------------- Developer Details -------------------");
        dev.calculateBonus(9);
        dev.performsReport("He Write the code Clearly.");
        dev.managingProjects("Maintain the Code.");
        dev.display();
        System.out.println("------------------- Programmer Details -------------------");
        pro.calculateBonus(5);
        pro.performsReport("He Good in Maintain The Code Bug Free.");
        pro.managingProjects("Maintain the Code.");
        pro.display();
    }
}






