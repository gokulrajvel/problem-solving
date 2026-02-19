public class sortColors {
    public static void main(String[] args) {
        int[] nums={2,1,0,2,1,0};
        sortColors sc=new sortColors();
        sc.sortColor(nums);
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
    public void sortColor(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1)
                mid++;
            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}
