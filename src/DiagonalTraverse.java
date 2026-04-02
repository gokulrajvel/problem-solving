import java.util.Arrays;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int index=0;
        int row=0,col=0;
        boolean up = true;
        while(row<m && col<n)
        {
            if(up)
            {
                while(row>0 && col<n-1){
                    result[index++]=mat[row][col];
                    row--;
                    col++;
                }
                result[index++]=mat[row][col];
                if(col==n-1)
                    row++;
                else
                    col++;
            }
            else{
                while(col>0 && row<m-1)
                {
                    result[index++]=mat[row][col];
                    col--;
                    row++;
                }
                result[index++]=mat[row][col];
                if(row==m-1)
                    col++;
                else
                    row++;
            }
            up=!up;
        }
        return result;
    }

    public static void main(String[] args) {
        DiagonalTraverse dt = new DiagonalTraverse();
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(dt.findDiagonalOrder(mat)));
    }
}
