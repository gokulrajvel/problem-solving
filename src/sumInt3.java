import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sumInt3 {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> list=new ArrayList<>();
            Arrays.sort(nums);
            for(int i=0;i<nums.length-2;i++){
                if(i>0&&nums[i-1]==nums[i])
                    continue;
                int left=i+1,right=nums.length-1;
                while(left<right){
                    int count=nums[left]+nums[i]+nums[right];
                    if(count==0){
                        list.add(Arrays.asList(nums[left],nums[i],nums[right]));
                        while(left<right&&nums[left]==nums[left+1])
                            left++;
                        while(left<right&&nums[right]==nums[right-1])
                            right--;
                    }
                    if(count<0)left++;
                    else
                        right--;
                }
            }
            return list;
        }
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            sumInt3 obj=new sumInt3();
            System.out.println(obj.threeSum(arr));
    }
}
