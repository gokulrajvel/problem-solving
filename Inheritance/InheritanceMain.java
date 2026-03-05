import oops.*;
import oops.Scanner;

import java.util.*;

public class InheritanceMain {
    public static void main(String[] args) throws NullPointerException {
        Scanner sc = new Scaner2();
        int len = sc.getInt();
        sc.print(len);
        int[] intArray = sc.getIntArray();
        sc.print(Arrays.toString(intArray));
        sc.print(intArray);

        String str = sc.getString();
        sc.print(str);
        String[] strArray = sc.getStringArray();
        sc.print(strArray);
    }
}
