import com.hackbase.BaseScanner;
import com.hackbase.ScannerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.asList;

public class SampleProgram {
    public static void main(String[] args) {
        BaseScanner sc=new BaseScanner();
        System.out.println("--------------------Enter Number--------------------");
        int val = sc.getInt();
        System.out.println("--------------------Enter String--------------------");
        String str = sc.getString();
        System.out.println("--------------------Enter Char----------------------");
        char ch = sc.getChar();
        System.out.println("--------------------Enter Array Len-----------------");
        int len = sc.getInt();
        System.out.println("--------------------Enter Array Values--------------");
        int[] arr = sc.getIntArray(len);
        System.out.println("--------------------Printing the Array Values-------");
        System.out.println(sc.displayArray(arr));
        Integer[] list = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(sc.displayArray(list));
        System.out.println("--------------------Enter Array Len for String------");
        int val2 = sc.getInt();
        System.out.println("--------------------Enter Array Values--------------");
        String[] arr2 = sc.getStringArray(val2);
        System.out.println("--------------------Printing the Array Values-------");
        System.out.println(sc.displayArray(arr2));

    }
}
