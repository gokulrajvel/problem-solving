public class minSubArrayLen {
    public static void main(String[] args) {
        minSubArrayLen obj=new minSubArrayLen();
        System.out.println(obj.subarrayLen(new int[]{2,3,1,2,4,3},7));
    }
    public int subarrayLen(int[] nums, int target) {
        int left=0,right=0,sum=0;
        int min=Integer.MAX_VALUE;
        for(;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum-=nums[left++];
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
