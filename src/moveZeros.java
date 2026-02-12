import java.util.Arrays;

public class moveZeros {
    public int[] moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            {
                nums[k++]=nums[i];
            }
        }
        for(int i=k;i<nums.length;i++)
            nums[i]=0;
        return nums;
    }
    public static void main(String[] args) {
        moveZeros obj=new moveZeros();
        System.out.println(Arrays.toString(obj.moveZeroes(new int[]{0,1,0,3,12})));
    }
}
