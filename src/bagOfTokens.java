public class bagOfTokens {
    public static void main(String[] args){
        bagOfTokens a=new bagOfTokens();
        System.out.println(a.bagOfToken(new int[]{100,200,300,400},200));
    }
    public int bagOfToken(int [] arr,int target){
        int left=0,right=arr.length-1;
        int max=0,val=0;
        while(left<=right){
            if(arr[left]<=target){
                target-=arr[left++];
                val++;
                max=Math.max(max,val);
            }
            else if(val>=1){
                target+=arr[right--];
                val--;
            }
            else  break;
        }
        return max;
    }
}
