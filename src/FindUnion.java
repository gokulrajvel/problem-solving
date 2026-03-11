import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class FindUnion {
    public static void main(String[] args) {
        FindUnion obj = new FindUnion();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(obj.countUnion(arr1,arr2));
    }
    public int countUnion(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        List<Integer> list=new  ArrayList<>();
        for(int val:arr1){
            list.add(val);
        }
        for(int i=0;i<m;i++){
            if(!list.contains(arr2[i])){
                list.add(arr2[i]);
            }
        }
        return list.size();
    }
}
