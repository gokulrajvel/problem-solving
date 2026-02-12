import java.util.Scanner;

public class stringReverse {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();
      System.out.println(reverse(s));
   }

   static String reverse(String s) {
      if (s.isEmpty()) {
         return s;
      } else {
         char var10000 = s.charAt(s.length() - 1);
         return var10000 + reverse(s.substring(0, s.length() - 1));
      }
   }
}
