public class removeDuplicates {
    public static void main(String[] str)
    {
        removeDuplicates obj=new removeDuplicates();
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int val=obj.removeDuplicate(arr);
        for(int i=0;i<val;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public int removeDuplicate(int[] nums){
        if(nums.length<1)
            return 1;

        int left=1,right=1,val=0;
        while(right<nums.length){
            if(nums[right]!=nums[right-1])
            {
                nums[left]=nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}
