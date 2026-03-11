import java.util.Scanner;

public class FindMinJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        FindMinJump obj = new FindMinJump();
        System.out.println(obj.findMinJumps(arr));
    }

    public int findMinJumps(int[] arr) {
        int n = arr.length;
        if (n == 0) return -1;
        int jumps = 0, start = 0, end = 0;
        for (int i = 0; i < n - 1; i++) {
            start = Math.max(start, i + arr[i]);
            if (i == end) {
                jumps++;
                end = start;
                if (end >= n - 1) break;
            }
        }

        return end < n - 1 ? -1 : jumps;

    }
}
//        while(start<=end){
//            if(arr[start]==0)
//                return -1;
//            else if(arr[start]-n>0){
//                count++;
//                start=arr[start];
//
//            }
//            else
//                start++;
//        }
//        return count;
