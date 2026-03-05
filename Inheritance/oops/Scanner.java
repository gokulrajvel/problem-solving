package oops;

public class Scanner {
    protected java.util.Scanner sc = new java.util.Scanner(System.in);
    protected int n;
    protected String str;
    protected int[] intArray;
    protected String[] stringArray;

    protected void setInt() {
        System.out.println("Enter number: ");
        n = sc.nextInt();
    }

    protected void setString() {
        System.out.println("Enter String: ");
        sc.nextLine();
        str = sc.nextLine();
    }

    protected void setIntArray(int length) {
        intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = sc.nextInt();
        }
    }

    protected void setStringArray(int length) {
        stringArray = new String[length];
        for (int i = 0; i < length; i++) {
            stringArray[i] = sc.next();
        }
    }

    public int getInt() {
        return n;
    }

    public String getString() {
        setString();
        return str;
    }

    public int[] getIntArray(int i) {
        return intArray;
    }
    public String[] getStringArray(int i) {
        return stringArray;
    }

    public void print(int n) {
        System.out.println();
    }

    public void print(String str) {
        System.out.println();
    }
}

