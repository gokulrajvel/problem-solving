public class sumBetweenNandM {
   public static void main(String[] args) {

       System.out.println(sumBetweenNandMs(2, 5));
   }

   static int sumBetweenNandMs(int n, int m) {

       return m <= n ? n : m + sumBetweenNandMs(n, m - 1);
   }
}
