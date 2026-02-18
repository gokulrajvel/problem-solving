import java.util.Arrays;

public class Permutation {
    public boolean checkInclusion(String p, String s) {
        int count=0;
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
                count++;
        }
        return count>0;
    }

    public static void main(String[] args) {
        Permutation p=new Permutation();
        System.out.println(p.checkInclusion("ab","eidbaooo"));
    }
}
