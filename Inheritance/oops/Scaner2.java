package oops;

public class Scaner2 extends Scanner {
    @Override
    public int getInt() {
        System.out.println("Enter number: ");
        setInt();
        return n;
    }

    @Override
    public String getString() {
        System.out.println("Enter String: ");
        setString();
        return str;
    }

    @Override
    public int[] getIntArray() {
        setIntArray();
        return intArray;
    }

    public String[] getStringArray() {
        setStringArray();
        return stringArray;
    }

    @Override
    public void print(int n) {
        System.out.println(n);
    }

    @Override
    public void print(String str) {
        System.out.println(str);
    }

}
