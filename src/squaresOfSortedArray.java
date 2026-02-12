import java.util.Arrays;

public class squaresOfSortedArray {
        public int[] sortedSquares(int[] nums) {
            for(int i=0;i<nums.length;i++){
                nums[i]*=nums[i];
            }
            int[] arr=new int[nums.length];
            int left=0,right=nums.length-1,ind=arr.length-1;
            while(left<right){
                if(nums[left]>nums[right]){
                    arr[ind]=nums[left++];
                }else{
                    arr[ind]=nums[right--];
                }
                ind--;
            }
            return arr;
        }
        public static void main(String[] args) {
            squaresOfSortedArray s=new squaresOfSortedArray();
            System.out.print(Arrays.toString(s.sortedSquares(new int[]{-7,-9,5,55,8})));
        }
}
