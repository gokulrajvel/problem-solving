public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber obj=new HouseRobber();
        System.out.println(obj.rob(new int[]{2,7,9,3,1}));
    }
    public int rob(int[] nums) {
        int rob1=0,rob2=0;
        for(int val:nums){
            int currentMax=Math.max(rob1+val,rob2);
            rob1=rob2;
            rob2=currentMax;
        }
        return rob2;
    }
}
