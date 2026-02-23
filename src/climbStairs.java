import java.util.Scanner;

public class climbStairs {
    public static void main(String[] args) {
        climbStairs obj = new climbStairs();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(obj.climbStair(n));
    }
    public int climbStair(int n) {
        if (n <= 2) return n;
        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first=second;
            second=third;
        }
        return second;
    }
}
