import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3,4));
        triangle.add(List.of(6,5,7));
        triangle.add(List.of(4,1,8,3));
        Triangle triangle1 = new Triangle();
        System.out.println(triangle1.minimumTotal(triangle));

    }
}


// List<Integer> list=triangle.get(0);
// int curVal=list.get(0),val=0;
// for(int i=1;i<triangle.size();i++){
//     List<Integer> list2=triangle.get(i);
//     if(list2.get(val)<list2.get(val+1)){
//         curVal+=list2.get(val);
//         val=val;
//     }
//     else if(list2.get(val)>list2.get(val+1)){
//         curVal+=list2.get(val+1);
//         val+=1;
//     }
// }
// return curVal;
