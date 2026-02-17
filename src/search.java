public class search {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target==nums[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        search search=new search();
        System.out.println(search.search(arr,target));
    }
}
