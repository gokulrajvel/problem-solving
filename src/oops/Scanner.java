package oops;
//import static java.lang.reflect.Array.setInt;

public class Scanner {
    protected java.util.Scanner sc=new java.util.Scanner(System.in);
    protected int n;
    protected String str;

    protected void setInt(){
        System.out.println("Enter number: ");
        n=sc.nextInt();
    }
    protected void setString(){
        System.out.println("Enter String: ");
        sc.nextLine();
        str=sc.nextLine();
    }
    public int getInt(){
        return n;
    }
    public String getString(){
        setString();
        return str;
    }
    public void printInt(){
        System.out.println();
    }
    public void printString(){
        System.out.println();
    }
}

