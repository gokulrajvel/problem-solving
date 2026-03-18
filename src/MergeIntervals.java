import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr=new int[][] {{1,3},{2,6},{8,10},{15,18}};
        MergeIntervals obj=new MergeIntervals();
        int[][] res=obj.merge(arr);
        System.out.println(Arrays.deepToString(res));
    }
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);
        for (int[] interval : intervals) {
            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                current = interval;
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
