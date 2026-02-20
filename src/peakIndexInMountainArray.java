public class peakIndexInMountainArray {
    public static void main(String[] args) {
        peakIndexInMountainArray obj=new peakIndexInMountainArray();
        System.out.println(obj.peakIndexInMountainArrays(new int[]{0,10,5,2}));
    }
    public int peakIndexInMountainArrays(int[] arr) {
        int left=0,right=arr.length-1;
        while(left<right){
            int mid=(right+left)/2;
            if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }
            else right=mid;
        }
        return left;
    }
}
// int i=0,max=Integer.MIN_VALUE,val=0;
// while(i<arr.length){
//     if(max<arr[i]){
//         val=i;
//         max=arr[i];
//     }
//     i++;
// }
