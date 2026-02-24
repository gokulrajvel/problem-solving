import java.util.Scanner;

public class containerWithMostWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[]  arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        containerWithMostWater obj=new containerWithMostWater();
        System.out.println(obj.container(arr));
    }
    public int container(int[] arr){
        int maxValue=0,left=0,right=arr.length-1;
        while(left<right){
            maxValue=Math.max(maxValue,(right-left)*Math.min(arr[left],arr[right]));
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxValue;
    }
}
