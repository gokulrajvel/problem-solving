import java.util.*;

public class SortEvenAndOddIndices {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int e = 0, o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(e++);
            } else {
                nums[i] = odd.get(o++);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        SortEvenAndOddIndices s=new SortEvenAndOddIndices();
        System.out.println(Arrays.toString(s.sortEvenOdd(arr)));
    }
}
