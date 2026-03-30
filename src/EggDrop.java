import java.util.Scanner;

public class EggDrop {
    public static void main(String[] args) {
        EggDrop sol = new EggDrop();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sol.twoEggDrop(n));
    }
    public int twoEggDrop(int n) {
        float product = 1.0f;
        for (int x = 1; x <= n; x++) {
            product = (float) (x * (x + 1)) / 2;
            if (Math.round(product) >= n)
                return x;
        }
        return 0;
    }
}
