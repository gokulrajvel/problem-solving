public class FindPivotIndex {
    public static void main(String[] args) {
        FindPivotIndex obj=new FindPivotIndex();
        System.out.println(obj.pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    public int pivotIndex(int[] nums) {
        // int left=0;
        for(int i=0;i<nums.length;i++){
            int left=0;
            int right=0;
            for(int k=0;k<i;k++){
                left+=nums[k];
            }
            for(int j=i+1;j<nums.length;j++){
                right+=nums[j];
            }
            if(left==right)
                return i;
        }
        return -1;
    }
}
