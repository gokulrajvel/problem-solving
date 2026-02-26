import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(rowIndex<1){
            return List.of(1);
        }
        if(rowIndex==1){
            return List.of(1,1);
        }
        triangle.add(List.of(1));
        triangle.add(List.of(1,1));
        for (int i = 2; i <=rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }
            list.add(1);
            triangle.add(list);
        }
        return triangle.get(rowIndex);
    }

    public static void main(String[] args) {
        PascalTriangleII obj=new PascalTriangleII();
        System.out.println(obj.getRow(5));
    }
}
