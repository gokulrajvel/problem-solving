public class divide {
    public static void main(String[] args) {
        divide p=new divide();
        System.out.println(p.divide(10,3));
    }
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long dividen=Math.abs((long)dividend);
        long divis=Math.abs((long)divisor);
        long value=dividen/divis;
        int val=(int)value;
        return isNegative?-val:val;
    }
}
