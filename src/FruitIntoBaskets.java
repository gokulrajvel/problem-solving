import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        FruitIntoBaskets obj=new FruitIntoBaskets();
        System.out.println(obj.FruitIntoBasket(new int[]{1,2,3,2,2}));
    }
    public int FruitIntoBasket(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        int left=0,right=0,max=0;
        while(right<arr.length){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while (map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}

//  brute force approach
// for(int i=0;i<len;i++){
//     Set<Integer> set=new HashSet<>();
//     for(int j=i;j<len;j++){
//         set.add(fruits[j]);
//         if(set.size()<=2)
//             max=Math.max(max,j-i+1);
//         else
//             break;
//     }
// }
// return max;