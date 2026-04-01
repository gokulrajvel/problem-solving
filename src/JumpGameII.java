public class JumpGameII {
    public static void main(String[] args) {
        JumpGameII jg = new JumpGameII();
        System.out.println(jg.jump(new int[]{2,3,1,1,4}));
    }
    public int jump(int[] nums) {
        int maxReach = 0,count=0,currentEnd=0;
        for(int i=0;i<nums.length-1;i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if(i==currentEnd){
                count++;
                currentEnd=maxReach;
            }
        }
        return count;
    }
}
