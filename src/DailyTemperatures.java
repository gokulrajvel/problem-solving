import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.print(Arrays.toString(arr));
    }

    public static int[] dailyTemperatures(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                ans[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        LinkedList<Integer> list = new LinkedList<>();
        return ans;
    }
}
