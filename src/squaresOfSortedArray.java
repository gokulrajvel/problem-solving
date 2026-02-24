import java.util.Arrays;

public class squaresOfSortedArray {
        public int[] sortedSquares(int[] nums) {
            for(int i=0;i<nums.length;i++){
                nums[i]*=nums[i];
            }
            int[] arr=new int[nums.length];
            int left=0,right=nums.length-1,index=arr.length-1;
            while(left<right){
                if(nums[left]>nums[right]){
                    arr[index]=nums[left++];
                }else{
                    arr[index]=nums[right--];
                }
                index--;
            }
            return arr;
        }
        public static void main(String[] args) {
            squaresOfSortedArray obj=new squaresOfSortedArray();
            System.out.print(Arrays.toString(obj.sortedSquares(new int[]{-7,-9,5,55,8})));
        }
}
