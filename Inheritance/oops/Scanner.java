package oops;

public class Scanner {
    protected java.util.Scanner sc = new java.util.Scanner(System.in);
    protected int n;
    protected String str;
    protected int[] intArray;
    protected String[] stringArray;

    protected void setInt() {
        n = sc.nextInt();
    }

    protected void setString() {
        sc.nextLine();
        str = sc.nextLine();
    }

    protected void setIntArray() {
        System.out.println("Enter Array length: ");
        n=sc.nextInt();
        intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
    }

    protected void setStringArray() {
        System.out.println("Enter Array length: ");
        n=sc.nextInt();
        stringArray = new String[n];
        for (int i = 0; i < n; i++) {
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

    public int[] getIntArray() {
        return intArray;
    }
    public String[] getStringArray() {
        return stringArray;
    }

    public void print(int n) {
        System.out.println();
    }

    public void print(String str) {
        System.out.println();
    }

    public void print(String[] strArray) {
        for (String str : strArray) {
            System.out.println(str);
        }
    }

    public void print(int[] intArray) {
        for (int n : intArray) {
            System.out.println(n);
        }
    }
}

