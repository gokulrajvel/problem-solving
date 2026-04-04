import java.util.Stack;

public class BasicCalculatorII {
    public static void main(String[] args) {
        BasicCalculatorII obj = new BasicCalculatorII();
        System.out.println(obj.calculate("3+2*2"));
    }
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int currentNum = 0;
        char operation = '+';
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            }
            if (!Character.isDigit(c) && c != ' ' || i == chars.length - 1) {
                if (operation == '+') stack.push(currentNum);
                if (operation == '-') stack.push(-currentNum);
                if (operation == '*') stack.push(stack.pop() * currentNum);
                if (operation == '/') stack.push(stack.pop() / currentNum);
                operation = c;
                currentNum = 0;
            }
        }
        int result = 0;
        for (int i : stack) result += i;
        return result;
    }
}
