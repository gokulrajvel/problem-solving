public class removeDuplicates {
    public int RemoveDuplicates(int[] nums) {
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

    public static void main(String[] args) {
        removeDuplicates rd = new removeDuplicates();
        int[] arr=new int[]{1,2,2,3,3,4};
        int n=rd.RemoveDuplicates(arr);
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
