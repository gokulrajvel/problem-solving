import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        JumpGame obj=new JumpGame();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the Values:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.canJump(arr));
    }
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i=0;i<nums.length;i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }
}
