import com.hackbase.ScannerClass;

import java.util.Arrays;


public class SampleProgram {
    public static void main(String[] args) {
        ScannerClass obj=new ScannerClass();
        int len=obj.getInt();
        String str= obj.getString();
        System.out.println(len);
        System.out.println(str);
        int[] arr=obj.getIntArray(len);
        obj.mergeSort(arr,0,arr.length-1);
        String[] arr1=obj.getStringArray(len);
        obj.displayArray(arr1);
        System.out.println(Arrays.toString(arr));
    }
}
