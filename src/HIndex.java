import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        HIndex h = new HIndex();
        System.out.print(h.hIndex(new int[]{3,0,6,1,5}));
    }
    int hIndex(int[] a){
        Arrays.sort(a);
        int len = a.length;
        for(int i=0;i<len;i++){
            int h=len-i;
            if(a[i]>=h){
                return h;
            }
        }
        return 0;
    }
}
