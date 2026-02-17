import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] arr=new int[]{2,0,2,1,1,0};
        sortColors sc=new sortColors();
        sc.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}
