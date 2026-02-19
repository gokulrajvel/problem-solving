public class maxSubArray {
    public static void main(String[] args) {
        maxSubArray maxsub=new maxSubArray();
        System.out.println(maxsub.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxsub.maxSubArray(new int[]{5,4,-1,7,8}));
    }
    public int maxSubArray(int[] nums) {
        int count=0,max=nums[0];
        for(int n:nums){
            if(count<0){
                count=0;
            }
            count+=n;
            max=Math.max(count,max);
        }
        return max;
    }
}
