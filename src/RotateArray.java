import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        for(int val:nums)
            list.add(val);
        Collections.rotate(list,k);
        for(int i=0;i<nums.length;i++)
            nums[i]=list.get(i);
    }

    public static void main(String[] args) {
        RotateArray obj=new RotateArray();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        obj.rotate(arr, 3);
        for (int val:arr)
            System.out.print(val+" ");
    }
}
