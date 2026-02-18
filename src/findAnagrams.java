import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAnagrams {
    public List<Integer> findAnagram(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length())
            return list;
        int[] pValue=new int[26];
        for(int i=0;i<p.length();i++)
            pValue[p.charAt(i)-'a']++;
        for(int i=0;i<s.length();i++){
            int[] sValue=new int[26];
            if(s.length()-i>=p.length()){
                String str=s.substring(i,i+p.length());
                for(int j=0;j<str.length();j++)
                    sValue[str.charAt(j)-'a']++;
            }
            if(Arrays.equals(pValue,sValue))
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        findAnagrams fa=new findAnagrams();
        System.out.println(fa.findAnagram("cbaebabacd","abc"));
    }
}
