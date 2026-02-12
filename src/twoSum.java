import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        twoSum add=new twoSum();
        int target=9;
        int[] nums2=add.twosumValue(nums1,target);
        for(int k:nums2)
            System.out.print(k+" ");
    }
    int[] twosumValue(int[] nums, int target) {
        Arrays.sort(nums);
        int index=0;
        int end=nums.length-1;
        while(index<end){
            if(nums[index]+nums[end]==target){
                return new int[]{nums[index],nums[end]};
            }
            else if(nums[index]+nums[end]<target){
                index++;
            }
            else if(nums[index]+nums[end]>target){
                end--;
            }
        }
        return new int[]{};
    }
}