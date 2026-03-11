import java.util.Arrays;
import java.util.Scanner;

public class ClockWiseRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        ClockWiseRotation obj = new ClockWiseRotation();
        obj.rotate(arr, val);
        System.out.println(Arrays.toString(arr));
    }

    public void rotate(int[] arr, int val) {
        int n = arr.length;
        val = val % n;
        for (int i = 0; i < val; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }
}
