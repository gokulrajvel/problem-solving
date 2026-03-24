import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        LargestDivisibleSubset obj=new LargestDivisibleSubset();
        System.out.println(obj.largestDivisibleSubset(new int[]{1,2,4,8}));
    }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] parent = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);
        int maxSize = 1, maxIndex = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxIndex = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        int idx = maxIndex;
        while (idx != -1) {
            result.add(nums[idx]);
            idx = parent[idx];
        }

        Collections.reverse(result);
        return result;
    }
}
