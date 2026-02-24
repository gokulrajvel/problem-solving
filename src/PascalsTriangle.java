import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangle obj = new PascalsTriangle();
        System.out.println(obj.generate(5));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows<=1){
            triangle.add(List.of(1));
            return triangle;
        }
        if(numRows==2){
            triangle.add(List.of(1));
            triangle.add(List.of(1,1));
            return triangle;
        }
        triangle.add(List.of(1));
        triangle.add(List.of(1,1));
        for (int i = 2; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }
            list.add(1);
            triangle.add(list);
        }
        return triangle;
    }
}
