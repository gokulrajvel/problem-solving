import java.util.Scanner;

public class factorial {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      System.out.println(factorial(n));
   }

   static int factorial(int n) {
       return n == 1 ? 1 : n * factorial(n - 1);
   }
}
