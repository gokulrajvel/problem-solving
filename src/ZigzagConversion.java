import java.util.Scanner;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows)
            return s;
        String str = "";
        String[] arr = new String[numRows];
        for (int i = 0; i < arr.length; i++)
            arr[i] = "";
        int index = 0;
        boolean down = true;
        for (char g : s.toCharArray()) {
            arr[index] += String.valueOf(g);
            if (index == 0)
                down = true;
            else if (index == numRows - 1)
                down = false;
            index += down ? 1 : -1;
        }
        for (String st : arr)
            str += st;
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ZigzagConversion obj = new ZigzagConversion();
        System.out.println(obj.convert(s, 4));
    }
}
