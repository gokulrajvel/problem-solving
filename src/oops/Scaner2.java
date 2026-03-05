package oops;

public class Scaner2 extends Scanner{
    @Override
    public int getInt(){
        setInt();
        return n;
    }
    public String getString(){
        setString();
        return str;
    }
    public void printInt(int n){
        System.out.print(n);
    }
    public void printString(String str){
        System.out.print(n);
    }
}
