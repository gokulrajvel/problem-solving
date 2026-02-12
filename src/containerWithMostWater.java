import java.util.Scanner;

public class containerWithMostWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        containerWithMostWater obj=new containerWithMostWater();
        System.out.println(obj.container(arr));
    }
    public int container(int[]arr){
        int max=0,i=0,j=arr.length-1;
        while(i<j){
            max=Math.max(max,(j-i)*Math.min(arr[i],arr[j]));
            if(arr[i]<arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
