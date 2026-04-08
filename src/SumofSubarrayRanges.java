public class SumofSubarrayRanges {
    public long subArrayRanges(int[] nums) {
        long result = 0;
        // Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int curmin = nums[i];
            int curmax = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                curmin = Math.min(curmin, nums[j]);
                curmax = Math.max(curmax, nums[j]);
                result += curmax - curmin;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SumofSubarrayRanges s = new SumofSubarrayRanges();
        System.out.println(s.subArrayRanges(new int[]{4,-2,-3,4,1}));
    }
}
