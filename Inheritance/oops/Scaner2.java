package oops;

public class Scaner2 extends Scanner {
    @Override
    public int getInt() {
        setInt();
        return n;
    }

    @Override
    public String getString() {
        setString();
        return str;
    }

    @Override
    public int[] getIntArray(int length) {
        setIntArray(length);
        return intArray;
    }

    public String[] getStringArray(int length) {
        setIntArray(length);
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
