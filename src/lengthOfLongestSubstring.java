import java.util.Scanner;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        lengthOfLongestSubstring obj=new lengthOfLongestSubstring();
        System.out.println(obj.lengthOfLongestSubstrings(str));
    }
    public int lengthOfLongestSubstrings(String s) {
        int start=0,end=0,max=Integer.MIN_VALUE;
        String substr="";
        while(end<s.length()){
            substr=s.substring(start,end);
            if(substr.contains(Character.toString(s.charAt(end)))) {
                max = Math.max(max, substr.length());
                start = end;
            }
            end++;
        }
        return max;
    }
}
