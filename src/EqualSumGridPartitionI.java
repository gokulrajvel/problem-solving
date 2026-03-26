public class EqualSumGridPartitionI {
    public static void main(String[] args) {
        EqualSumGridPartitionI obj=new EqualSumGridPartitionI();
        System.out.println(obj.canPartitionGrid(new int[][]{
                {1,3},
                {2,4}
        }));
    }
    public boolean canPartitionGrid(int[][] grid) {
        long total=0;
        for(int i=0;i<grid.length;i++){
            for(long m:grid[i]){
                total+=m;
            }
        }
        long currentVal=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++)
                currentVal+=grid[i][j];
            if(total-currentVal==currentVal)
                return true;
        }
        long currentVal1=0;
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++)
                currentVal1+=grid[j][i];
            if(total-currentVal1==currentVal1)
                return true;
        }
        return false;
    }
}
