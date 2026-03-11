import java.util.Scanner;

public class SumOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SumOfPairs obj = new SumOfPairs();
        System.out.println(obj.getPairsCount(arr, k));
    }

    public int getPairsCount(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int left = 0, right = left + 1;
        while (right < n) {
            int val = arr[left] + arr[right];
            if (arr[left] + arr[left] == k)
                sum++;
            if (val == k) {
                sum++;
                left = right;
                right++;
            } else
                right++;
        }
        return sum;
    }
}
