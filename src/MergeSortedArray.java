import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m,j=0;
        for(;i<m+n;i++)
            nums1[i]=nums2[j++];
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m=3;
        int[] nums2 = {2,5,6};
        int n=3;
        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
