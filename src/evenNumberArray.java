import java.util.Scanner;

public class evenNumberArray {
   public static void main(String[] args) {
      new Scanner(System.in);
      int[] n = new int[]{2, 5, 6, 8, 2, 9, 22};
      System.out.println(evenNumber(n, n.length - 1));
   }

   static int evenNumber(int[] n, int len) {
      if (len < 0) {
         return 0;
      } else {
         return n[len] % 2 == 0 ? 1 + evenNumber(n, len - 1) : evenNumber(n, len - 1);
      }
   }
}
