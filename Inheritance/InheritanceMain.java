import oops.*;
import oops.Scanner;

import java.util.*;

public class InheritanceMain {
    public static void main(String[] args) throws NullPointerException {
        Scanner sc = new Scaner2();
        int len = sc.getInt();
        sc.print(len);
        String str = sc.getString();
        sc.print(str);
        int[] intArray = sc.getIntArray(5);
        sc.print(Arrays.toString(intArray));
        String[] strArray = sc.getStringArray(5);
    }
}
