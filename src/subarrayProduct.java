public class subarrayProduct {
    public static void main(String[] args) {
        subarrayProduct obj=new subarrayProduct();
        System.out.println(obj.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
    }
    public int numSubarrayProductLessThanK(int[] nums, int target) {
        if(target<=1)
            return 0;
        int result=0,left=0,right=0,product=1;
        while(right<nums.length){
            product *= nums[right];
            while(product>=target)
                product/=nums[left++];
            result+=1+(right-left);
            right++;
        }
        return result;
    }
}
