public class sumOfnNumber {
   public static void main(String[] args) {

       System.out.println(sumOfnNumbers(5));
   }

   static int sumOfnNumbers(int n) {

       return n == 1 ? 1 : n + sumOfnNumbers(n - 1);
   }
}
