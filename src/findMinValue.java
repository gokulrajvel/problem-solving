public class findMinValue {
   public static void main(String[] args) {
      int[] arr = new int[]{5, 6, 8, 9, 25};
      System.out.println(findMinValue(arr, arr.length - 1));
   }

   static int findMinValue(int[] arr, int len) {
      return len < 0 ? arr[0] : Math.min(findMinValue(arr, len - 1), arr[len]);
   }
}
