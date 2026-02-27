public class HouseRobber4 {
    public static void main(String[] args) {
        HouseRobber4 obj=new HouseRobber4();
        System.out.println(obj.minCapability(new int[]{2,7,9,3,1},2));
    }
    public int minCapability(int[] nums, int k) {
        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for (int num : nums) {
            left = Math.min(left, num);
            right = Math.max(right, num);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canRob(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }
    private boolean canRob(int[] nums, int k, int cap) {
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= cap) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count >= k;
    }
}
