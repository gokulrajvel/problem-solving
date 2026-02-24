public class JumpGame {
    public static void main(String[] args) {
        JumpGame obj = new JumpGame();
        System.out.println(obj.jumpGame(new int[]{2,3,1,1,4}));
    }
    public boolean jumpGame(int[] arr) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(i>max){
                return false;
            }
            max=Math.max(max,i+arr[i]);
        }
        return true;
    }
}
