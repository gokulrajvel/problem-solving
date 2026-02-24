public class TrappingRainWater {
    public int trap(int[] height) {
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        int start=0,last=height.length-1;
        int result=0;
        while(start<last){
            if(height[start]<height[last]){
                if(height[start]>=leftMax)
                    leftMax=height[start];
                else
                    result+=leftMax-height[start];
                start++;
            }
            else{
                if(height[last] >= rightMax)
                    rightMax=height[last];
                else
                    result+=rightMax-height[last];
                last--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TrappingRainWater obj=new TrappingRainWater();
        int[] arr=new int[]{0,1,0,2,1,0,1,3,2,1};
        System.out.println(obj.trap(arr));
    }
}
