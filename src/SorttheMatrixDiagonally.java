import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorttheMatrixDiagonally {
    public static void main(String[] args) {
        SorttheMatrixDiagonally s = new SorttheMatrixDiagonally();
        int[][] arr = new int[][]{
                {3,3,1,1},
                {2,2,1,2},
                {1,1,1,2}
        };
        arr=s.diagonalSort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        for (int i = 0; i < n; i++) {
            helper(mat, i, 0);
        }
        for (int i = 1; i < m; i++) {
            helper(mat, 0, i);
        }
        return mat;
    }
    private void helper(int[][] mat, int row, int col) {
        int i = row, j = col;
        List<Integer> list = new ArrayList<>();
        while (i < mat.length && j < mat[0].length) {
            list.add(mat[i][j]);
            i++;
            j++;
        }
        Collections.sort(list);
        i=row;
        j=col;
        int index = 0;
        while (i < mat.length && j < mat[0].length) {
            mat[i][j] = list.get(index++);
            i++;
            j++;
        }
    }
}
