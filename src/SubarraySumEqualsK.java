public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK obj=new SubarraySumEqualsK();
        System.out.println(obj.subarraySum(new int[]{2,7,9,3,1},2));
    }
}
