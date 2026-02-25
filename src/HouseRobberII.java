public class HouseRobberII {
    public static void main(String[] args) {
        HouseRobberII obj=new HouseRobberII();
        System.out.println(obj.rob(new int[]{1,2,3,4}));
    }
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(findValue(nums,0,nums.length-2),findValue(nums,1,nums.length-1));
    }
    public int findValue(int[] nums, int start, int end){
        int maxValue=0,secVal=0;
        for(int i=start;i<=end;i++){
            int temp=maxValue;
            maxValue=Math.max(maxValue,secVal+nums[i]);
            secVal=temp;
        }
        return maxValue;
    }
}
