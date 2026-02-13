public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        findMaxConsecutiveOnes obj=new findMaxConsecutiveOnes();
        System.out.println(obj.findMaxConsecutiveOne(new int[]{1,1,0,1,1,1}));
    }
    public int findMaxConsecutiveOne(int[] nums) {
        int left=0,right=0,max=Integer.MIN_VALUE;
        while(right<nums.length){
            if(nums[right]==1){
                max=Math.max(max,right-left+1);
            }
            else
                left=right+1;
            right++;
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}
