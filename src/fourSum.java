import java.util.*;

public class fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4)
            return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> list=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target)
                    {
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if(sum>target)
                        right--;
                    else left++;
                }
            }
        }
        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        fourSum obj=new fourSum();
        System.out.println(obj.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }
}
