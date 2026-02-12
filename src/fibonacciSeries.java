import java.util.Scanner;

public class fibonacciSeries {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for(int i = 0; i < n; ++i) {
         System.out.println(fibonacci(i) + " ");
      }

   }

   static int fibonacci(int n) {
      if (n == 0) {
         return 0;
      } else {
         return n == 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
      }
   }
}
