public class JumpGame2 {
    public static void main(String[] args) {
        JumpGame2 obj = new JumpGame2();
        System.out.println(obj.jumpGame2(new int[]{2,3,1,1,4}));
    }
    public int jumpGame2(int[] arr) {
        int maxValue=0,currentindex=0,count=0;
        for(int i=0;i<arr.length-1;i++){
            maxValue=Math.max(maxValue,i+arr[i]);
            if(i==currentindex){
                count++;
                currentindex=maxValue;
            }
        }
        return count;
    }
}
