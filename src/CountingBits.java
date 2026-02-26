import java.util.Arrays;

public class CountingBits {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            String ar=Integer.toBinaryString(i).replace("0","");
            // int count=0;
            // for(int j=0;j<ar.length;j++){
            //     if(ar[j].equals("1"))
            //         count++;
            // }
            arr[i]=ar.length();
        }
        return arr;
    }

    public static void main(String[] args) {
        CountingBits obj=new CountingBits();
        System.out.println(Arrays.toString(obj.countBits(10)));
    }
}
