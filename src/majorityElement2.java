import java.util.*;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        majorityElement majorityElement=new majorityElement();
        System.out.println(majorityElement.majorityElements(arr));
    }
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int max=nums.length/3,val=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
            if(map.get(nums[i])>max&&!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
