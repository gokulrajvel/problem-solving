import java.util.Scanner;

public class sumOfTheDigits {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      System.out.println(sumOfTheDigit(n));
   }

   static int sumOfTheDigit(int n) {
      int sum = 10;
      return n == 0 ? 0 : n % 10 + sumOfTheDigit(n / 10);
   }
}
