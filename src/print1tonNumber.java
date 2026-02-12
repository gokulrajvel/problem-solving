public class print1tonNumber {
   public static void main(String[] args) {
      print1tonNumbers(5);
   }

   static int print1tonNumbers(int n) {
      if (n <= 1) {
         return 1;
      } else {
         System.out.print(print1tonNumbers(n - 1) + " ");
         return n;
      }
   }
}
