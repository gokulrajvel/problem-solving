public class LargestNumberAtLeastTwice {
    public static void main(String[] args) {
        LargestNumberAtLeastTwice obj=new LargestNumberAtLeastTwice();
        System.out.println(obj.dominantIndex(new int[]{3,6,1,0}));
    }
    public int dominantIndex(int[] nums) {
        int max=-1,secMax=-1,index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
                index=i;
            }
            else if(nums[i]>secMax){
                secMax=nums[i];
            }
        }
        return (max>=2*secMax)?index:-1;
    }
}
