import java.util.HashMap;

public class majorityElement {
    public int majorityElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE,val=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],0);
            if(max<map.get(nums[i])){
                val=nums[i];
                max=map.get(nums[i]);
            }
        }
        return val;
    }

    public static void main(String[] args) {
        int[] arr={3,2,3};
        majorityElement majorityElement=new majorityElement();
        System.out.println(majorityElement.majorityElements(arr));
    }
}
