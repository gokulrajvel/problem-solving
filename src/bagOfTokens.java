public class bagOfTokens {
    public static void main(String[] args){
        bagOfTokens obj=new bagOfTokens();
        System.out.println(obj.bagOfToken(new int[]{100,200,300,400},200));
    }
    public int bagOfToken(int [] arr,int target){
        int left=0,right=arr.length-1;
        int max=0,score=0;
        while(left<=right){
            if(arr[left]<=target){
                target-=arr[left++];
                score++;
                max=Math.max(max,score);
            }
            else if(score>=1){
                target+=arr[right--];
                score--;
            }
            else  break;
        }
        return max;
    }
}
