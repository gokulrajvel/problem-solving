import java.util.Scanner;

public class LeetcodeBank {
    public int totalMoney(int n) {
        int weekly=1;
        int result=0;
        int val=1;
        for(int i=1;i<=n;i++){
            result+=val++;
            if(i%7==0){
                weekly++;
                val=weekly;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LeetcodeBank obj = new LeetcodeBank();
        int n = scan.nextInt();
        System.out.println(obj.totalMoney(n));
    }
}
